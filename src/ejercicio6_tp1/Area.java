package ejercicio6_tp1;

public class Area {
    private String nombre;
    private float km2;
    private ParqueNacional parque;

    public Area(String nombre, float km2, ParqueNacional parque) {
        this.nombre = nombre;
        this.km2 = km2;
        this.parque = parque;
    }

    public String getNombre() {
        return nombre;
    }

    public float getKm2() {
        return km2;
    }

    public ParqueNacional getParque() {
        return parque;
    }
}
