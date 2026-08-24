package ejercicio8_tp1;

import java.util.ArrayList;
import java.util.List;

public class Aerodromo {

    private String nombre;
    private List<Hangar> hangares;

    public Aerodromo(String nombre) {
        this.nombre = nombre;
        this.hangares = new ArrayList<>();
    }

    public Hangar crearHangar(int numero, int capacidad, String ubicacion) {
        Hangar hangar = new Hangar(numero, capacidad, ubicacion);
        hangares.add(hangar);
        return hangar;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Hangar> getHangares() {
        return hangares;
    }
}
