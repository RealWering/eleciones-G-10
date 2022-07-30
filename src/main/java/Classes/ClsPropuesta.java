package Classes;

/**
 *
 * @author user
 */
public class ClsPropuesta {

    private String numDocCandidato;
    private String sector;
    private String descripcion;
    private String fecha;

    public ClsPropuesta(String numDocCandidato, String sector, String descripcion, String fecha) {
        this.numDocCandidato = numDocCandidato;
        this.sector = sector;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public String getNumDocCandidato() {
        return numDocCandidato;
    }

    public void setNumDocCandidato(String numDocCandidato) {
        this.numDocCandidato = numDocCandidato;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
