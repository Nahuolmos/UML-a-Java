package ejercicio6_tp1;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.List;

public class Excursion {
    private String codigo;
    private LocalDateTime fecha;
    private List<Alojamiento> alojamientosOrganizadores;
    private List<Visitante> inscriptos;

    public Excursion(String codigo, LocalDateTime fecha) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.alojamientosOrganizadores = new ArrayList<>();
        this.inscriptos = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void agregarAlojamientoOrganizador(Alojamiento alojamiento) {
        this.alojamientosOrganizadores.add(alojamiento);
    }

    public void inscribirVisitante(Visitante visitante) {
        this.inscriptos.add(visitante);
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public List<Visitante> getInscriptos() {
        return inscriptos;
    }
}
