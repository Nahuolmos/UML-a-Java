package ejercicio7_tp1;

public class PruebaEquipo extends Prueba{
    public PruebaEquipo(String nombre) {
        super(nombre);
    }

    @Override
    public boolean admite(Participante p) {
        return p instanceof Equipo;
    }
}
