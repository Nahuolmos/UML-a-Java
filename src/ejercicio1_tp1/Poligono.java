package ejercicio1_tp1;

import java.util.ArrayList;
import java.util.List;

public abstract class Poligono extends Figura {
    private List<Lado> lados;

    public Poligono() {
        super();
        this.lados = new ArrayList<>();
    }

    public void agregarLado(Lado lado) {
        this.lados.add(lado);
    }

    public List<Lado> getLados() {
        return lados;
    }
    
    public int getCantidadDeLados() {
        return this.lados.size();
    }
}
