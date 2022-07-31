/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Classes.ClsJdbc;
import Classes.ClsMensaje;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class MdlVotar {
    
     ClsJdbc jdbc;

    public MdlVotar() {
        this.jdbc = new ClsJdbc();
        this.jdbc.CrearConexion();
    }
    
     public ClsMensaje Votar(String cedula,String h, String ide) {
        ClsMensaje mensaje = new ClsMensaje();
        try {
            String sql = "INSERT INTO tbl_voto  VALUES(?,?,?,now ())";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, cedula);
            sentencia.setString(2, h);
            sentencia.setString(3, ide);

            

           mensaje.CambiarMensaje(mensaje.ADVERTENCIA, "Esta seguro de su voto por el candidato? " + ide);
            int a = JOptionPane.showConfirmDialog(null, mensaje.getDescripcion(), mensaje.getTipo(), 2);
            if (a == 0) {
                int resultado = sentencia.executeUpdate();

                if (resultado == 1) {
                    mensaje.CambiarMensaje(mensaje.OK, "su voto fue registrado: ");
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
