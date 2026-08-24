package ejercicio9_tp1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Museo {

    private String nombre;
    private List<ObjetoArte> coleccion;
    private List<Exposicion> exposiciones;
    private List<Coleccion> coleccionesAsociadas;

    public Museo(String nombre) {
        this.nombre = nombre;
        this.coleccion = new ArrayList<>();
        this.exposiciones = new ArrayList<>();
        this.coleccionesAsociadas = new ArrayList<>();
    }

    public void agregarObjeto(ObjetoArte objeto) {
        coleccion.add(objeto);
    }

    public Exposicion crearExposicion(String nombre, LocalDate fechaComienzo, LocalDate fechaFin) {
        Exposicion exposicion = new Exposicion(nombre, fechaComienzo, fechaFin);
        exposiciones.add(exposicion);
        return exposicion;
    }

    public void registrarColeccion(Coleccion coleccion) {
        coleccionesAsociadas.add(coleccion);
    }

    public String getNombre() {
        return nombre;
    }

    public List<ObjetoArte> getColeccion() {
        return coleccion;
    }

    public List<Exposicion> getExposiciones() {
        return exposiciones;
    }

    public List<Coleccion> getColeccionesAsociadas() {
        return coleccionesAsociadas;
    }
}
