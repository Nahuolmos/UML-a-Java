package ejercicio6_tp1;

import java.util.Date;

public class ReservaAlojamiento {
    private Visitante visitante;
    private Alojamiento alojamiento;
    private String habitacion;
    private Date fechaInicio;
    private Date fechaFin;

    public ReservaAlojamiento(Visitante visitante, Alojamiento alojamiento, String habitacion, Date fechaInicio, Date fechaFin) {
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

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }
}
