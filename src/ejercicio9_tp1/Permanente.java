package ejercicio9_tp1;

import java.time.LocalDate;

public class Permanente extends Pertenencia {

    private LocalDate fechaAdquisicion;
    private float coste;
    private EstadoObjeto estado;

    public Permanente(LocalDate fechaAdquisicion, float coste, EstadoObjeto estado) {
        this.fechaAdquisicion = fechaAdquisicion;
        this.coste = coste;
        this.estado = estado;
    }

    public void moverA(EstadoObjeto nuevoEstado) {
        estado = nuevoEstado;
    }

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public float getCoste() {
        return coste;
    }

    public EstadoObjeto getEstado() {
        return estado;
    }
}
