package ejercicio7_tp1;

import java.util.ArrayList;
import java.util.List;

public final class Equipo extends Participante {
    private String codigo;
    private String entrenador;
    private List<Esquiador> esquiadores = new ArrayList<>();

    public Equipo(String codigo, String entrenador) {
        this.codigo = codigo;
        this.entrenador = entrenador;
    }

    public void agregarEsquiador(Esquiador e) {
        e.fijarModo(Modo.EQUIPO);
        esquiadores.add(e);
    }

    // Atributo derivado: no hay campo 'cantidad', se consulta la colección
    public int getCantidadEsquiadores() {
        return esquiadores.size();
    }

    @Override
    public boolean acepta(Prueba prueba) {
        return prueba instanceof PruebaEquipo;
    }
}
