package ejercicio6_tp1;

public class Celador extends Personal {
    private Entrada entradaAsignada;

    public Celador(String dni, String nombre, String direccion, String telefono, float sueldo, String numSeguridadSocial, ParqueNacional parque, Entrada entradaAsignada) {
        super(dni, nombre, direccion, telefono, sueldo, numSeguridadSocial, parque);
        this.entradaAsignada = entradaAsignada;
    }

    public Entrada getEntradaAsignada() {
        return entradaAsignada;
    }

    public void setEntradaAsignada(Entrada entradaAsignada) {
        this.entradaAsignada = entradaAsignada;
    }
}
