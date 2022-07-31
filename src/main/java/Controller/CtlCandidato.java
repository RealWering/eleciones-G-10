package Controller;

import Classes.ClsCandidato;
import Classes.ClsMensaje;
import Model.MdlCandidato;
import java.util.LinkedList;

/**
 *
 * @author user
 */
public class CtlCandidato {

    MdlCandidato modelo;

    public CtlCandidato() {

        this.modelo = new MdlCandidato();

    }

    public ClsMensaje AgregarCandidato(ClsCandidato candidato) {
        ClsMensaje respuesta = this.modelo.AgregarCandidato(candidato);
        return respuesta;

    }
    
    public ClsMensaje EliminarCandidato(String numDoc) {
        ClsMensaje respuesta = this.modelo.EliminarCandidato(numDoc);
        return respuesta;
    }
    
    
    
    
    
     public LinkedList<ClsCandidato> ObtenerCandidatos(){
    return this.modelo.ObtenerCandidatos();
    
    }

   
}
