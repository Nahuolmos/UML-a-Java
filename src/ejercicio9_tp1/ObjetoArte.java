package ejercicio9_tp1;

public class ObjetoArte {

    private int numeroIdentificacion;
    private Artista artista;
    private Integer anioCreacion;
    private String titulo;
    private String descripcion;
    private Origen origen;
    private Pertenencia pertenencia;

    public ObjetoArte(int numeroIdentificacion, Artista artista, Integer anioCreacion, String titulo, String descripcion, Origen origen, Pertenencia pertenencia) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.artista = artista;
        this.anioCreacion = anioCreacion;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.origen = origen;
        this.pertenencia = pertenencia;
    }

    public boolean esDeLaColeccionPermanente() {
        return pertenencia instanceof Permanente;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public Artista getArtista() {
        return artista;
    }

    public Integer getAnioCreacion() {
        return anioCreacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Origen getOrigen() {
        return origen;
    }

    public Pertenencia getPertenencia() {
        return pertenencia;
    }
}
