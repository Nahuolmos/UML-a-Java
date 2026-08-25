package ejercicio7_tp1;

public class PruebaIndividual extends Prueba {
    public PruebaIndividual(String nombre) {
        super(nombre);
    }

    @Override
    public boolean admite(Participante p) {
        return p instanceof Esquiador;
    }
}
