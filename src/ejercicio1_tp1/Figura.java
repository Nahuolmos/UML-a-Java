package ejercicio1_tp1;

import java.util.ArrayList;
import java.util.List;

public class Figura {

    private List<Figura> figuras = new ArrayList<>();
    private Figura figura;

    public Figura() {  
    }

    public void agregarFigura(Figura figura) {
        if (figura == this) {throw new RuntimeException("La figura no puede contenerse a si misma.");}
        if (figura == null) {throw new RuntimeException("La figura no puede ser nula");}
        figuras.add(figura);
    }
    
    public List<Figura> getFiguras() {
        return figuras;
    }
}
