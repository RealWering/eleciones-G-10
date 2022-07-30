package Classes;



/**
 *
 * @author user
 */
public class ClsCandidato extends ClsPersona {

    private String partidoPolitico;
    private String ciudadOrigen;
    private String descripcion;
    private String mensajeCampania;

    private String propuesta;

    public ClsCandidato(String partidoPolitico, String ciudadOrigen, String descripcion, String mensajeCampania, String propuesta, String numeroDoc, String nombre, String telefono) {
        super(numeroDoc, nombre, telefono);
        this.partidoPolitico = partidoPolitico;
        this.ciudadOrigen = ciudadOrigen;
        this.descripcion = descripcion;
        this.mensajeCampania = mensajeCampania;
        this.propuesta = propuesta;
    }

    public ClsCandidato(String partidoPolitico, String ciudadOrigen, String descripcion, String numeroDoc, String nombre, String telefono) {
        super(numeroDoc, nombre, telefono);
        this.partidoPolitico = partidoPolitico;
        this.ciudadOrigen = ciudadOrigen;
        this.descripcion = descripcion;
    }

    public ClsCandidato(String partidoPolitico, String numeroDoc, String nombre, String telefono) {
        super(numeroDoc, nombre, telefono);
        this.partidoPolitico = partidoPolitico;
    }
    
    
    

   

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }

    public String getMensajeCampania() {
        return mensajeCampania;
    }

    public void setMensajeCampania(String mensajeCampania) {
        this.mensajeCampania = mensajeCampania;
    }

    public String getPropuesta() {
        return propuesta;
    }

    public void setPropuesta(String propuesta) {
        this.propuesta = propuesta;
    }

}
