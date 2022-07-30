package Classes;
/**
 *
 * @author user
 */
public class ClsVotante extends ClsPersona {    

    private String ciudadRegistro;
    private String correo;

    public ClsVotante(String ciudadRegistro, String correo, String numeroDoc, String nombre, String telefono) {
        super(numeroDoc, nombre, telefono);
        this.ciudadRegistro = ciudadRegistro;
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
     

    public String getCiudadRegistro() {
        return ciudadRegistro;
    }

    public void setCiudadRegistro(String ciudadRegistro) {
        this.ciudadRegistro = ciudadRegistro;
    }
}
