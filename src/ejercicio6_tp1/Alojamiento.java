package ejercicio6_tp1;

public class Alojamiento {
    private String nombre;
    private int capacidad;
    private String categoria;
    private ParqueNacional parque;

    public Alojamiento(String nombre, int capacidad, String categoria, ParqueNacional parque) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.categoria = categoria;
        this.parque = parque;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getCategoria() {
        return categoria;
    }
}
