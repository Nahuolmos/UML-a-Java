package ejercicio6_tp1;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class ParqueNacional {
    private String nombre;
    private LocalDate fechaDeclaracion;

    private List<ComunidadAutonoma> comunidades;
    private List<Area> areas;
    private List<Entrada> entradas;
    private List<Alojamiento> alojamientos;
    private List<Personal> empleados;

    public ParqueNacional(String nombre, LocalDate fechaDeclaracion) {
        this.nombre = nombre;
        this.fechaDeclaracion = fechaDeclaracion;
        this.comunidades = new ArrayList<>();
        this.areas = new ArrayList<>();
        this.entradas = new ArrayList<>();
        this.alojamientos = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaDeclaracion() {
        return fechaDeclaracion;
    }

    public void agregarComunidad(ComunidadAutonoma ca) {
        if (!comunidades.contains(ca)) {
            comunidades.add(ca);
        }
    }

    public void agregarArea(Area area) {
        this.areas.add(area);
    }

    public void agregarEntrada(Entrada entrada) {
        this.entradas.add(entrada);
    }

    public void agregarAlojamiento(Alojamiento alojamiento) {
        this.alojamientos.add(alojamiento);
    }

    public void contratarPersonal(Personal personal) {
        this.empleados.add(personal);
    }

    public List<Area> getAreas() {
        return areas;
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }

    public List<Alojamiento> getAlojamientos() {
        return alojamientos;
    }

    public List<Personal> getEmpleados() {
        return empleados;
    }
}
