package ejercicio8_tp1;

import java.time.LocalDate;

public class Propiedad {

    private final Avion avion;
    private final Persona propietario;
    private final LocalDate fechaAdquisicion;

    public Propiedad(Avion avion, Persona propietario, LocalDate fechaAdquisicion) {
        this.avion = avion;
        this.propietario = propietario;
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public Avion getAvion() {
        return avion;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }
}
