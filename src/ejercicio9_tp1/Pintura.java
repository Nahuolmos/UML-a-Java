package ejercicio9_tp1;

public class Pintura extends ObjetoArte {

    private String tipoPintura;
    private String soporte;
    private String estilo;

    public Pintura(int numeroIdentificacion, Artista artista, Integer anioCreacion, String titulo, String descripcion, Origen origen, Pertenencia pertenencia, String tipoPintura, String soporte, String estilo) {
        super(numeroIdentificacion, artista, anioCreacion, titulo, descripcion, origen, pertenencia);
        this.tipoPintura = tipoPintura;
        this.soporte = soporte;
        this.estilo = estilo;
    }

    public String getTipoPintura() {
        return tipoPintura;
    }

    public String getSoporte() {
        return soporte;
    }

    public String getEstilo() {
        return estilo;
    }
}
