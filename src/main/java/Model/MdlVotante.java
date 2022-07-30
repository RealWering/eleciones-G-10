
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import Classes.ClsJdbc;
import Classes.ClsMensaje;
import Classes.ClsVotante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class MdlVotante {

    ClsJdbc jdbc;

    public MdlVotante() {
        this.jdbc = new ClsJdbc();
        this.jdbc.CrearConexion();

    }

    public ClsMensaje AgregarVotante(ClsVotante votante) {
        ClsMensaje mensaje = new ClsMensaje();
        try {
            String sql = "INSERT INTO tbl_votante VALUES(?,?,?,?,?) ";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, votante.getNumeroDoc());
            sentencia.setString(2, votante.getNombre());
            sentencia.setString(3, votante.getTelefono());
            sentencia.setString(4, votante.getCorreo());
            sentencia.setString(5, votante.getCiudadRegistro());

            int resultado = sentencia.executeUpdate();
            if (resultado == 1) {
                mensaje.CambiarMensaje(mensaje.OK, "El Votante fué resgistrado: ");
            } else {
                mensaje.CambiarMensaje(mensaje.ERROR, "Error no encontrado");

            }
            return mensaje;

        } catch (Exception e) {
            mensaje.CambiarMensaje(mensaje.ERROR, "Excepción: " + e.getMessage());
            return mensaje;
        }

    }

    public LinkedList<ClsVotante> ObtenerVotantes() {
        

        try {

            LinkedList<ClsVotante> listaVotantes = new LinkedList<>();
            String sql = "SELECT * FROM tbl_votante";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                
                String ciudadRegistro= resultados.getString("ciudad");
                String correo = resultados.getString("correo");
                String numeroDoc = resultados.getString("id_votante");
                String nombre = resultados.getString("nombre");
                String telefono = resultados.getString("telefono");

                ClsVotante votant = new ClsVotante(ciudadRegistro, correo, numeroDoc, nombre, telefono);
                listaVotantes.add(votant);

            }

            return listaVotantes;

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
            return null;
        }

    }
    
public ClsMensaje EliminarVotante(String numDoc) {
        ClsMensaje mensaje = new ClsMensaje();
        try {
            String sql = "DELETE FROM  tbl_votante WHERE id_votante = ?";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, numDoc);
            mensaje.CambiarMensaje(mensaje.ADVERTENCIA, "Esta seguro de ELIMINAR el votante? " + numDoc);
            int a = JOptionPane.showConfirmDialog(null, mensaje.getDescripcion(), mensaje.getTipo(), 2);
            if (a == 0) {
                int resultado = sentencia.executeUpdate();

                if (resultado == 1) {
                    mensaje.CambiarMensaje(mensaje.OK, "Se elimino el votante: ");
                } else {
                    mensaje.CambiarMensaje(mensaje.ERROR, "Error no encontrado");

                }
                return mensaje;
            } else {
                return null;

            }
            

        } catch (Exception e) {

            mensaje.CambiarMensaje(mensaje.ERROR, "Excepción: " + e.getMessage());
            return mensaje;
        }
    }
}
