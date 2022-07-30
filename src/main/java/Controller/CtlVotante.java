/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import Classes.ClsMensaje;
import Classes.ClsVotante;
import Model.MdlVotante;
import java.util.LinkedList;

/**
 *
 * @author user
 */
public class CtlVotante {
    
    MdlVotante modelo;
    
    public CtlVotante(){
    
        this.modelo= new MdlVotante();
    
    }

    
    public ClsMensaje AgregarVotante(ClsVotante votante){
        ClsMensaje respuesta = this.modelo.AgregarVotante(votante);
        return respuesta;
    }
    public LinkedList<ClsVotante> ObtenerVotantes(){
    return this.modelo.ObtenerVotantes();
    }
    
    public ClsMensaje EliminarVotante(String numDoc) {
        ClsMensaje respuesta = this.modelo.EliminarVotante(numDoc);
        return respuesta;
    }
    
}
