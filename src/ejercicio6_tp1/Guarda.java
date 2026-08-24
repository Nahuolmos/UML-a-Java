package ejercicio6_tp1;

public class Guarda extends Personal {
    private String tipoVehiculo;
    private String matricula;
    private Area areaAsignada;

    public Guarda(String dni, String nombre, String direccion, String telefono, float sueldo, String numSeguridadSocial, ParqueNacional parque, String tipoVehiculo, String matricula, Area areaAsignada) {
        super(dni, nombre, direccion, telefono, sueldo, numSeguridadSocial, parque);
        this.tipoVehiculo = tipoVehiculo;
        this.matricula = matricula;
        this.areaAsignada = areaAsignada;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public String getMatricula() {
        return matricula;
    }

    public Area getAreaAsignada() {
        return areaAsignada;
    }
}
