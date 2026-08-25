package ejercicio10_tp1;

import java.util.ArrayList;
import java.util.List;

public class Polideportivo extends Complejo {
    private final List<Area> areas = new ArrayList<>();

    public Polideportivo(String localizacion, String jefe, double area) {
        super(localizacion, jefe, area);
    }

    public void agregarArea(Area a) {
        areas.add(a);
    }

    @Override
    public String tipoInfo() {
        return "Polideportivo con " + areas.size() + " áreas designadas.";
    }
}