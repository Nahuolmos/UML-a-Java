package ejercicio1_tp1;

import java.util.ArrayList;
import java.util.List;

public class Poligono extends Figura {
    private int numeroLados;
    private List<Lado> lados = new ArrayList<>();

    public Poligono() {
        super();
    }

    public void agregarLado(Lado lado) {
        lados.add(lado);
        numeroLados = lados.size();
    }

    public int getNumeroLados() {
        return numeroLados;
    }
    
    public List<Lado> getLados() {
        return lados;
    }
}
