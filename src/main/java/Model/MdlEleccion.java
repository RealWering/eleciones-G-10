/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Classes.ClsCandidato;
import Classes.ClsElecciones;
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
public class MdlEleccion {

    ClsJdbc jdbc;

    public MdlEleccion() {
        this.jdbc = new ClsJdbc();
        this.jdbc.CrearConexion();
    }

    public ClsMensaje AgregarEleccion(ClsElecciones eleccion) {
        ClsMensaje mensaje = new ClsMensaje();
        try {
            String sql = "INSERT INTO tbl_eleccion (nombre,tipo,fecha,fecha_fin,estado) VALUES(?,?,?,?,?)";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, eleccion.getNombre());
            sentencia.setString(2, eleccion.getTipo());
            sentencia.setString(3, eleccion.getFechaInicio());
            sentencia.setString(4, eleccion.getFechaFinal());
            sentencia.setString(5, eleccion.getEstado());
            int resultado = sentencia.executeUpdate();

            if (resultado == 1) {
                mensaje.CambiarMensaje(mensaje.OK, "La Eleccion fué resgistrada: ");
            } else {
                mensaje.CambiarMensaje(mensaje.ERROR, "Error no encontrado");

            }
            return mensaje;

        } catch (Exception e) {

            mensaje.CambiarMensaje(mensaje.ERROR, "Excepción: " + e.getMessage());
            return mensaje;
        }
    }

    public ClsMensaje InscribirCandidato(String h, String id) {
        ClsMensaje mensaje = new ClsMensaje();
        try {
            String sql = "INSERT INTO tbl_inscripcion  VALUES(?,?,now())";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, h);
            sentencia.setString(2, id);

            int resultado = sentencia.executeUpdate();

            if (resultado == 1) {
                mensaje.CambiarMensaje(mensaje.OK, "El candidato ");
            } else {
                mensaje.CambiarMensaje(mensaje.ERROR, "Error no encontrado");

            }
            return mensaje;

        } catch (Exception e) {

            mensaje.CambiarMensaje(mensaje.ERROR, "Excepción: " + e.getMessage());
            return mensaje;
        }
    }

    public ClsMensaje CerrarEleccion(String id) {
        ClsMensaje mensaje = new ClsMensaje();
        try {
            String sql = "UPDATE tbl_eleccion SET estado = 'cerrada' WHERE id_eleccion = ?";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, id);
            mensaje.CambiarMensaje(mensaje.ADVERTENCIA, "Esta seguro de CERRAR la  Elección? " + id);
            int a = JOptionPane.showConfirmDialog(null, mensaje.getDescripcion(), mensaje.getTipo(), 2);
            if (a == 0) {
                int resultado = sentencia.executeUpdate();

                if (resultado == 1) {
                    mensaje.CambiarMensaje(mensaje.OK, "Se Cerro la elección: ");
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

    public ClsMensaje EliminarEleccion(String id) {
        ClsMensaje mensaje = new ClsMensaje();
        try {
            String sql = "DELETE FROM  tbl_eleccion WHERE id_eleccion = ?";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, id);
            mensaje.CambiarMensaje(mensaje.ADVERTENCIA, "Esta seguro de ELIMINAR la  Elección? " + id);
            int a = JOptionPane.showConfirmDialog(null, mensaje.getDescripcion(), mensaje.getTipo(), 2);
            if (a == 0) {
                int resultado = sentencia.executeUpdate();

                if (resultado == 1) {
                    mensaje.CambiarMensaje(mensaje.OK, "Se elimino la elección: ");
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
    
     public ClsMensaje EliminarInscripcion(String id) {
        ClsMensaje mensaje = new ClsMensaje();
        try {
            String sql = "DELETE FROM  tbl_nscripcion WHERE id_eleccion = ?";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, id);
            mensaje.CambiarMensaje(mensaje.ADVERTENCIA, "Esta seguro de ELIMINAR la  Inscripcion del Candidato? " + id);
            int a = JOptionPane.showConfirmDialog(null, mensaje.getDescripcion(), mensaje.getTipo(), 2);
            if (a == 0) {
                int resultado = sentencia.executeUpdate();

                if (resultado == 1) {
                    mensaje.CambiarMensaje(mensaje.OK, "Se elimino la Inscripcion: ");
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

    public LinkedList<ClsElecciones> ObtenerElecciones() {

        try {

            LinkedList<ClsElecciones> listaEleccion = new LinkedList<>();
            String sql = "SELECT * FROM tbl_eleccion";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String tipo = resultados.getString("tipo");
                String estado = resultados.getString("estado");
                int id = resultados.getInt("id_eleccion");
                String nombre = resultados.getString("nombre");
                String fechain = resultados.getString("fecha");
                String fechaf = resultados.getString("fecha_fin");

                ClsElecciones eleccio = new ClsElecciones(estado, "", tipo, fechain, fechaf, nombre, id);
                listaEleccion.add(eleccio);

            }

            return listaEleccion;

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
            return null;
        }

    }
     public LinkedList<ClsElecciones> ObtenerEleccionesA() {

        try {

            LinkedList<ClsElecciones> listaEleccion = new LinkedList<>();
            String sql = "SELECT * FROM tbl_eleccion WHERE estado = 'abierta'";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String tipo = resultados.getString("tipo");
                String estado = resultados.getString("estado");
                int id = resultados.getInt("id_eleccion");
                String nombre = resultados.getString("nombre");
                String fechain = resultados.getString("fecha");
                String fechaf = resultados.getString("fecha_fin");

                ClsElecciones eleccio = new ClsElecciones(estado, "", tipo, fechain, fechaf, nombre, id);
                listaEleccion.add(eleccio);

            }

            return listaEleccion;

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
            return null;
        }

    }


    public LinkedList<ClsCandidato> ObtenerInscritos(String ide) {

        try {
            LinkedList<ClsCandidato> listaInscrito = new LinkedList<>();
            String sql = "SELECT  nombre, partido_politico FROM tbl_candidato INNER  JOIN tbl_inscripcion ON tbl_candidato.id_candidato = tbl_inscripcion.id_candidato WHERE id_eleccion= ?";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, ide);
            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {

                String nombre = resultado.getString("nombre");
                String partido = resultado.getString("partido_politico");
                String ida = resultado.getString("id_candidato");

                ClsCandidato insa = new ClsCandidato(partido,ida , nombre, null);
                listaInscrito.add(insa);
            }

            return listaInscrito;

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
            return null;
        }
    }

}
