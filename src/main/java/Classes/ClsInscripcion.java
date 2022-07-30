
package Classes;

/**
 *
 * @author user
 */
public class ClsInscripcion {
    private String fechaInscripcion;
    private String idCandidato;
    private String idEleccion;

    public ClsInscripcion(String fechaInscripcion,String idCandidato,String idEleccion) {
        this.fechaInscripcion = fechaInscripcion;
        this.idCandidato = idCandidato;
        this.idEleccion = idEleccion;
    }

    public String getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(String idCandidato) {
        this.idCandidato = idCandidato;
    }

    public String getIdEleccion() {
        return idEleccion;
    }

    public void setIdEleccion(String idEleccion) {
        this.idEleccion = idEleccion;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }
    
    
}
