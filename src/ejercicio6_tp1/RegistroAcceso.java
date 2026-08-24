package ejercicio6_tp1;

import java.time.LocalDate;

public class RegistroAcceso {
    private Celador celador;
    private Visitante visitante;
    private LocalDate fechaHora;

    public RegistroAcceso(Celador celador, Visitante visitante, LocalDate fechaHora) {
        this.celador = celador;
        this.visitante = visitante;
        this.fechaHora = fechaHora;
    }

    public Celador getCelador() {
        return celador;
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public LocalDate getFechaHora() {
        return fechaHora;
    }
}
