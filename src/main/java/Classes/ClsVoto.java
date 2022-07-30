package Classes;

/**
 *
 * @author user
 */
public class ClsVoto {

    private String fecha;
    private String candidato;
    private String votante;

    public ClsVoto(String fecha, String candidato, String votante) {
        this.fecha = fecha;
        this.candidato = candidato;
        this.votante = votante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCandidato() {
        return candidato;
    }

    public void setCandidato(String candidato) {
        this.candidato = candidato;
    }

    public String getVotante() {
        return votante;
    }

    public void setVotante(String votante) {
        this.votante = votante;
    }

}
