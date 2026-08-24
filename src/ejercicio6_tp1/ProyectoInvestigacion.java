package ejercicio6_tp1;

import java.time.LocalDate;

public class ProyectoInvestigacion {
    private String nombre;
    private float presupuesto;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public ProyectoInvestigacion(String nombre, float presupuesto, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPresupuesto() {
        return presupuesto;
    }
}
