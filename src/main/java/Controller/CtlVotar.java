/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Classes.ClsMensaje;
import Model.MdlVotante;
import Model.MdlVotar;

/**
 *
 * @author user
 */
public class CtlVotar {
    
     MdlVotar modelo;
    
    public CtlVotar(){
    
        this.modelo= new MdlVotar();
    
    }
    
    
   public ClsMensaje Votar(String cedula, String h, String ide) {
        ClsMensaje respuesta = this.modelo.Votar(cedula,h, ide);
        return respuesta;
    }

    
}
