package ejercicio9_tp1;

public class Origen {

    private String pais;
    private String cultura;
    private String epoca;

    public Origen(String pais, String cultura, String epoca) {
        this.pais = pais;
        this.cultura = cultura;
        this.epoca = epoca;
    }

    public String getPais() {
        return pais;
    }

    public String getCultura() {
        return cultura;
    }

    public String getEpoca() {
        return epoca;
    }
}
