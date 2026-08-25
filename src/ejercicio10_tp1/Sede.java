package ejercicio10_tp1;

import java.util.ArrayList;
import java.util.List;

public final class Sede {
    private double presupuestoAproximado;
    private final List<Complejo> complejos = new ArrayList<>();

    public Sede(double presupuestoAproximado) {
        this.presupuestoAproximado = presupuestoAproximado;
    }

    public void agregarComplejo(Complejo c) {
        complejos.add(c);
    }

    public int nroComplejos() {
        return complejos.size();
    }
}