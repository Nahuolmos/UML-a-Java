package ejercicio10_tp1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Complejo {
    private String localizacion;
    private String jefeOrganizacion;
    private double areaOcupada;
    private final List<Evento> eventos = new ArrayList<>();

    public Complejo(String localizacion, String jefeOrganizacion, double areaOcupada) {
        this.localizacion = localizacion;
        this.jefeOrganizacion = jefeOrganizacion;
        this.areaOcupada = areaOcupada;
    }

    public void celebrarEvento(Evento e) {
        eventos.add(e);
    }

    public List<Evento> getEventos() {
        return Collections.unmodifiableList(eventos);
    }

    public abstract String tipoInfo();
}