package ejercicio11_tp1;

import java.time.LocalDate;

public class Reunion {
    private LocalDate fechaUltima;
    private LocalDate fechaProxima;
    private double porcentajeComision;

    public Reunion(LocalDate fechaUltima, LocalDate fechaProxima, double porcentajeComision) {
        this.fechaUltima = fechaUltima;
        this.fechaProxima = fechaProxima;
        this.porcentajeComision = porcentajeComision;
    }

    public LocalDate getFechaUltima() { return fechaUltima; }
    public double getPorcentajeComision() { return porcentajeComision; }
}
