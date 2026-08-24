package ejercicio8_tp1;

import java.util.ArrayList;
import java.util.List;

public class Piloto extends Persona {

    private String numeroLicencia;
    private String restricciones;
    private List<TipoAvion> tiposAutorizados;

    public Piloto(String numeroSeguridadSocial, String nombre, String direccion, String telefono, String numeroLicencia, String restricciones) {
        super(numeroSeguridadSocial, nombre, direccion, telefono);
        this.numeroLicencia = numeroLicencia;
        this.restricciones = restricciones;
        this.tiposAutorizados = new ArrayList<>();
    }

    public void autorizarTipo(TipoAvion tipoAvion) {
        if (!tiposAutorizados.contains(tipoAvion)) {
            tiposAutorizados.add(tipoAvion);
        }
    }

    public boolean estaAutorizadoPara(TipoAvion tipoAvion) {
        return tiposAutorizados.contains(tipoAvion);
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public String getRestricciones() {
        return restricciones;
    }

    public void setRestricciones(String restricciones) {
        this.restricciones = restricciones;
    }

    public List<TipoAvion> getTiposAutorizados() {
        return tiposAutorizados;
    }
}
