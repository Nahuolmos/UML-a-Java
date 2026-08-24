package ejercicio6_tp1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Excursion {
    private String codigo;
    private Date dia;
    private String hora;
    private List<Alojamiento> alojamientosOrganizadores;
    private List<Visitante> inscriptos;

    public Excursion(String codigo, Date dia, String hora) {
        this.codigo = codigo;
        this.dia = dia;
        this.hora = hora;
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

    public Date getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }

    public List<Visitante> getInscriptos() {
        return inscriptos;
    }
}
