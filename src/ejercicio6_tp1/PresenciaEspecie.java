package ejercicio6_tp1;

public class PresenciaEspecie {
    private Area area;
    private Especie especie;
    private int numIndividuos;

    public PresenciaEspecie(Area area, Especie especie, int numIndividuos) {
        this.area = area;
        this.especie = especie;
        this.numIndividuos = numIndividuos;
    }

    public Area getArea() {
        return area;
    }

    public Especie getEspecie() {
        return especie;
    }

    public int getNumIndividuos() {
        return numIndividuos;
    }

    public void setNumIndividuos(int numIndividuos) {
        this.numIndividuos = numIndividuos;
    }
}
