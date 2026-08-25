package ejercicio10_tp1;

public class Monodeportivo extends Complejo {
    private String deporteUnico;

    public Monodeportivo(String localizacion, String jefe, double area, String deporteUnico) {
        super(localizacion, jefe, area);
        this.deporteUnico = deporteUnico;
    }

    @Override
    public String tipoInfo() {
        return "Monodeportivo enfocado en: " + deporteUnico;
    }
}
