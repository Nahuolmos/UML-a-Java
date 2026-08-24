package ejercicio9_tp1;

import java.time.LocalDate;

public class Artista {

    private String nombre;
    private LocalDate fechaNacimiento;
    private LocalDate fechaDefuncion;
    private String paisOrigen;
    private String epoca;
    private String estiloPrincipal;
    private String descripcion;

    public Artista(String nombre, LocalDate fechaNacimiento, LocalDate fechaDefuncion, String paisOrigen, String epoca, String estiloPrincipal, String descripcion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaDefuncion = fechaDefuncion;
        this.paisOrigen = paisOrigen;
        this.epoca = epoca;
        this.estiloPrincipal = estiloPrincipal;
        this.descripcion = descripcion;
    }

    public boolean estaVivo() {
        return fechaDefuncion == null;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public LocalDate getFechaDefuncion() {
        return fechaDefuncion;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public String getEpoca() {
        return epoca;
    }

    public String getEstiloPrincipal() {
        return estiloPrincipal;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
