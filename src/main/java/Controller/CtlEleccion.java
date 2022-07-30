/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Classes.ClsCandidato;
import Classes.ClsElecciones;
import Classes.ClsInscripcion;
import Classes.ClsMensaje;
import Model.MdlEleccion;
import java.util.LinkedList;

/**
 *
 * @author user
 */
public class CtlEleccion {
    
    MdlEleccion modelo;
    
    public CtlEleccion(){
    this.modelo=new MdlEleccion();
    
    }
    public ClsMensaje AgregarEleccion(ClsElecciones eleccion) {
        ClsMensaje respuesta = this.modelo.AgregarEleccion(eleccion);
        return respuesta;

    }
    
    public ClsMensaje EliminarEleccion(String id) {
        ClsMensaje respuesta = this.modelo.EliminarEleccion(id);
        return respuesta;
    }
    
    public ClsMensaje InscribirCandidato(String h,String id) {
        ClsMensaje respuesta = this.modelo.InscribirCandidato(h,id);
        return respuesta;
    }
    public ClsMensaje CerrarEleccion(String id) {
        ClsMensaje respuesta = this.modelo.CerrarEleccion(id);
        return respuesta;
    }
    
     public LinkedList<ClsCandidato> ObtenerInscritos(String ide){
    return this.modelo.ObtenerInscritos(ide);    
     }
    
    
    public LinkedList<ClsElecciones> ObtenerElecciones(){
    return this.modelo.ObtenerElecciones();
    
    }
    
    
    
    
}
