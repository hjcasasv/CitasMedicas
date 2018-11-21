package info.godhc.CitasMedicas.view;

/**
 * Created by GOD HC on 01/12/2016.
 */

public class entidad {
    private String cliente;
    private String doctor;

    public entidad() {cliente = doctor = "";}

    public entidad(String cliente, String doctor){
        this.cliente = cliente;
        this.doctor = doctor;
    }

    public String getCliente(){
        return cliente;
    }

    public String getDoctor() {
        return doctor;
    }
}
