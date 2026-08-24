package ejercicio6_tp1;

import java.util.Date;

public class RegistroAcceso {
    private Celador celador;
    private Visitante visitante;
    private Date fechaHora;

    public RegistroAcceso(Celador celador, Visitante visitante, Date fechaHora) {
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

    public Date getFechaHora() {
        return fechaHora;
    }
}
