package ejercicio8_tp1;

public class TipoAvion {

    private int numeroModelo;
    private int capacidad;
    private float pesoKg;

    public TipoAvion(int numeroModelo, int capacidad, float pesoKg) {
        this.numeroModelo = numeroModelo;
        this.capacidad = capacidad;
        this.pesoKg = pesoKg;
    }

    public int getNumeroModelo() {
        return numeroModelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public float getPesoKg() {
        return pesoKg;
    }
}
