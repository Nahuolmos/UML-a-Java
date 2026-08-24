package ejercicio8_tp1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RegistroServicio {

    private final Avion avion;
    private final Mecanico mecanico;
    private final LocalDate fecha;
    private final float horasInvertidas;
    private final TipoTrabajo tipoTrabajo;

    public RegistroServicio(Avion avion, Mecanico mecanico, LocalDate fecha, float horasInvertidas, TipoTrabajo tipoTrabajo) {
        this.avion = avion;
        this.mecanico = mecanico;
        this.fecha = fecha;
        this.horasInvertidas = horasInvertidas;
        this.tipoTrabajo = tipoTrabajo;
    }

    public Avion getAvion() {
        return avion;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public float getHorasInvertidas() {
        return horasInvertidas;
    }

    public TipoTrabajo getTipoTrabajo() {
        return tipoTrabajo;
    }
}
