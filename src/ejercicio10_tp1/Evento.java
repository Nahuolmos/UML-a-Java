package ejercicio10_tp1;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public final class Evento {
    private LocalDate fecha;
    private int duracionMinutos;
    private int nroParticipantes;
    private final Set<Comisario> comisarios = new LinkedHashSet<>();
    private final Set<Material> materiales = new LinkedHashSet<>();

    public Evento(LocalDate fecha, int duracionMinutos, int nroParticipantes) {
        this.fecha = fecha;
        this.duracionMinutos = duracionMinutos;
        this.nroParticipantes = nroParticipantes;
    }

    public void asociarComisario(Comisario c) {
        comisarios.add(c);
        c.registrarEvento(this);
    }

    public void agregarMaterial(Material m) {
        materiales.add(m);
    }

    public int nroComisarios() {
        return comisarios.size();
    }
}