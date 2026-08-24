package ejercicio8_tp1;

import java.util.ArrayList;
import java.util.List;

public class Mecanico extends Persona {

    private float salario;
    private Turno turno;
    private List<TipoAvion> tiposAutorizados;
    private List<RegistroServicio> serviciosRealizados;

    public Mecanico(String numeroSeguridadSocial, String nombre, String direccion, String telefono, float salario, Turno turno) {
        super(numeroSeguridadSocial, nombre, direccion, telefono);
        this.salario = salario;
        this.turno = turno;
        this.tiposAutorizados = new ArrayList<>();
        this.serviciosRealizados = new ArrayList<>();
    }

    public void autorizarTipo(TipoAvion tipoAvion) {
        if (!tiposAutorizados.contains(tipoAvion)) {
            tiposAutorizados.add(tipoAvion);
        }
    }

    public boolean estaAutorizadoPara(TipoAvion tipoAvion) {
        return tiposAutorizados.contains(tipoAvion);
    }

    void agregarRegistro(RegistroServicio registro) {
        serviciosRealizados.add(registro);
    }

    public float getSalario() {
        return salario;
    }

    public Turno getTurno() {
        return turno;
    }

    public List<TipoAvion> getTiposAutorizados() {
        return tiposAutorizados;
    }

    public List<RegistroServicio> getServiciosRealizados() {
        return serviciosRealizados;
    }
}
