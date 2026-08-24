package ejercicio9_tp1;

public class Escultura extends ObjetoArte {

    private String material;
    private float alturaM;
    private float pesoKg;
    private String estilo;

    public Escultura(int numeroIdentificacion, Artista artista, Integer anioCreacion, String titulo, String descripcion, Origen origen, Pertenencia pertenencia, String material, float alturaM, float pesoKg, String estilo) {
        super(numeroIdentificacion, artista, anioCreacion, titulo, descripcion, origen, pertenencia);
        this.material = material;
        this.alturaM = alturaM;
        this.pesoKg = pesoKg;
        this.estilo = estilo;
    }

    public String getMaterial() {
        return material;
    }

    public float getAlturaM() {
        return alturaM;
    }

    public float getPesoKg() {
        return pesoKg;
    }

    public String getEstilo() {
        return estilo;
    }
}
