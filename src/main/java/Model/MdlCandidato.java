/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Classes.ClsCandidato;
import Classes.ClsInscripcion;
import Classes.ClsJdbc;
import Classes.ClsMensaje;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class MdlCandidato {

    ClsJdbc jdbc;

    public MdlCandidato() {
        this.jdbc = new ClsJdbc();
        this.jdbc.CrearConexion();
    }

    public ClsMensaje AgregarCandidato(ClsCandidato candidato) {
        ClsMensaje mensaje = new ClsMensaje();
        try {
            String sql = "INSERT INTO tbl_candidato VALUES(?,?,?,?,?,?,?,'ff')";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, candidato.getNumeroDoc());
            sentencia.setString(2, candidato.getNombre());
            sentencia.setString(3, candidato.getTelefono());
            sentencia.setString(4, candidato.getPartidoPolitico());
            sentencia.setString(5, candidato.getCiudadOrigen());
            sentencia.setString(6, candidato.getDescripcion());
            sentencia.setString(7, candidato.getMensajeCampania());
            int resultado = sentencia.executeUpdate();

            if (resultado == 1) {
                mensaje.CambiarMensaje(mensaje.OK, "El Candidato fué resgistrado: ");
            } else {
                mensaje.CambiarMensaje(mensaje.ERROR, "Error no encontrado");

            }
            return mensaje;

        } catch (Exception e) {

            mensaje.CambiarMensaje(mensaje.ERROR, "Excepción: " + e.getMessage());
            return mensaje;
        }
    }

    public ClsMensaje EliminarCandidato(String numDoc) {
        ClsMensaje mensaje = new ClsMensaje();
        try {
            String sql = "DELETE FROM  tbl_candidato WHERE id_candidato = ?";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, numDoc);
            mensaje.CambiarMensaje(mensaje.ADVERTENCIA, "Esta seguro de ELIMINAR el Candidato? " + numDoc);
            int a = JOptionPane.showConfirmDialog(null, mensaje.getDescripcion(), mensaje.getTipo(), 2);
            if (a == 0) {
                int resultado = sentencia.executeUpdate();

                if (resultado == 1) {
                    mensaje.CambiarMensaje(mensaje.OK, "Se elimino el candidato: ");
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

    
    public LinkedList<ClsCandidato> ObtenerCandidatos() {

        try {

            LinkedList<ClsCandidato> listaCandidato = new LinkedList<>();
            String sql = "SELECT * FROM tbl_candidato";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String partidoPolitico = resultados.getString("partido_politico");
                String ciudadOrigen = resultados.getString("ciudad_origen");
                String descripcion = resultados.getString("descripcion");
                String numeroDoc = resultados.getString("id_candidato");
                String nombre = resultados.getString("nombre");
                String telefono = resultados.getString("telefono");

                ClsCandidato candidat = new ClsCandidato(partidoPolitico, ciudadOrigen, descripcion, numeroDoc, nombre, telefono);
                listaCandidato.add(candidat);

            }

            return listaCandidato;

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
            return null;
        }

    }
    

}
