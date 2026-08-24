package ejercicio6_tp1;

import java.util.ArrayList;
import java.util.List;

public class Investigador extends Personal {
    private String titulacion;
    private List<ProyectoInvestigacion> proyectos;
    private List<Especie> especiesInvestigadas;

    public Investigador(String dni, String nombre, String direccion, String telefono, float sueldo, String numSeguridadSocial, ParqueNacional parque, String titulacion) {
        super(dni, nombre, direccion, telefono, sueldo, numSeguridadSocial, parque);
        this.titulacion = titulacion;
        this.proyectos = new ArrayList<>();
        this.especiesInvestigadas = new ArrayList<>();
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void agregarProyecto(ProyectoInvestigacion proyecto) {
        this.proyectos.add(proyecto);
    }

    public void agregarEspecieInvestigada(Especie especie) {
        this.especiesInvestigadas.add(especie);
    }
}
