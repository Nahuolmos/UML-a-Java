package ejercicio8_tp1;

import java.util.ArrayList;
import java.util.List;

public class Hangar {

    private int numero;
    private int capacidad;
    private String ubicacion;
    private List<Avion> aviones;

    public Hangar(int numero, int capacidad, String ubicacion) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
        this.aviones = new ArrayList<>();
    }

    public void estacionar(Avion avion) {
        if (aviones.size() >= capacidad) {
            throw new IllegalStateException("El hangar " + numero + " está completo.");
        }
        aviones.add(avion);
        avion.asignarHangar(this);
    }

    public int cuantosAvionesTiene() {
        return aviones.size();
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public List<Avion> getAviones() {
        return aviones;
    }
}
