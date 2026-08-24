package ejercicio9_tp1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Exposicion {

    private String nombre;
    private LocalDate fechaComienzo;
    private LocalDate fechaFin;
    private List<ObjetoArte> objetosExhibidos;

    public Exposicion(String nombre, LocalDate fechaComienzo, LocalDate fechaFin) {
        this.nombre = nombre;
        this.fechaComienzo = fechaComienzo;
        this.fechaFin = fechaFin;
        this.objetosExhibidos = new ArrayList<>();
    }

    public void agregarObjeto(ObjetoArte objeto) {
        objetosExhibidos.add(objeto);
    }

    public boolean vigenteEn(LocalDate fecha) {
        return !fecha.isBefore(fechaComienzo) && !fecha.isAfter(fechaFin);
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaComienzo() {
        return fechaComienzo;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public List<ObjetoArte> getObjetosExhibidos() {
        return objetosExhibidos;
    }
}
