package ejercicio10_tp1;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Comisario {
    private String nombre;
    private final Set<Evento> eventosInvolucrado = new LinkedHashSet<>();

    public Comisario(String nombre) {
        this.nombre = nombre;
    }

    public void registrarEvento(Evento e) {
        eventosInvolucrado.add(e);
    }

    public Set<Evento> getEventos() {
        return Collections.unmodifiableSet(eventosInvolucrado);
    }
}