package ejercicio10_tp1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReporteService {

    public List<Comisario> comisariosMasActivos(List<Comisario> todos) {
        if (todos.isEmpty()) return new ArrayList<>();

        int max = todos.stream()
                .mapToInt(c -> c.getEventos().size())
                .max()
                .orElse(0);

        return todos.stream()
                .filter(c -> c.getEventos().size() == max)
                .collect(Collectors.toList());
    }
}
