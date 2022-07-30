package Classes;

/**
 *
 * @author user
 */
public class ClsPersona {

    private String numeroDoc;
    private String nombre;
    private String telefono;
    

    public ClsPersona(String numeroDoc, String nombre, String telefono) {
        this.numeroDoc = numeroDoc;
        this.nombre = nombre;
        this.telefono = telefono;
       
    }

    public String getNumeroDoc() {
        return numeroDoc;
    }

    public void setNumeroDoc(String numeroDoc) {
        this.numeroDoc = numeroDoc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

   

}
