package ejercicio6_tp1;

import java.time.LocalDate;

public class ReservaAlojamiento {
    private Visitante visitante;
    private Alojamiento alojamiento;
    private String habitacion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public ReservaAlojamiento(Visitante visitante, Alojamiento alojamiento, String habitacion, LocalDate fechaInicio, LocalDate fechaFin) {
        this.visitante = visitante;
        this.alojamiento = alojamiento;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public Alojamiento getAlojamiento() {
        return alojamiento;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }
}
