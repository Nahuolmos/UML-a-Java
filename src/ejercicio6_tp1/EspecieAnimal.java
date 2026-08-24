package ejercicio6_tp1;

import java.util.ArrayList;
import java.util.List;

public class EspecieAnimal extends Especie {

    private String periodoCelo;
    private TipoAlimentacion alimentacion;
    private List<Especie> seAlimentaDe;

    public EspecieAnimal(String nombreCientifico, String nombreVulgar, String periodoCelo, TipoAlimentacion alimentacion) {
        super(nombreCientifico, nombreVulgar);
        this.periodoCelo = periodoCelo;
        this.alimentacion = alimentacion;
        this.seAlimentaDe = new ArrayList<>();
    }

    public String getPeriodoCelo() {
        return periodoCelo;
    }

    public void setPeriodoCelo(String periodoCelo) {
        this.periodoCelo = periodoCelo;
    }

    public TipoAlimentacion getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(TipoAlimentacion alimentacion) {
        this.alimentacion = alimentacion;
    }

    public List<Especie> getSeAlimentaDe() {
        return seAlimentaDe;
    }

    public void agregarAlimento(Especie especie) {
        this.seAlimentaDe.add(especie);
    }
}
