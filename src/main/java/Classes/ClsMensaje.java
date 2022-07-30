package Classes;

/**
 *
 * @author user
 */
public class ClsMensaje {

    public final String OK = "ok";
    public String ERROR = "Error";
    public String ADVERTENCIA = "Advertencia";

    private String tipo;
    private String descripcion;

    public ClsMensaje() {

    }

    public void CambiarMensaje(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;

    }



public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    

}
