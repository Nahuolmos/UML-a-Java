package ejercicio9_tp1;

import java.time.LocalDate;

public class EnPrestamo extends Pertenencia {

    private Coleccion coleccion;
    private LocalDate fechaRecepcion;
    private LocalDate fechaDevolucion;

    public EnPrestamo(Coleccion coleccion, LocalDate fechaRecepcion, LocalDate fechaDevolucion) {
        this.coleccion = coleccion;
        this.fechaRecepcion = fechaRecepcion;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Coleccion getColeccion() {
        return coleccion;
    }

    public LocalDate getFechaRecepcion() {
        return fechaRecepcion;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }
}
