package ejercicio6_tp1;

import java.util.Date;

public class ProyectoInvestigacion {
    private String nombre;
    private float presupuesto;
    private Date fechaInicio;
    private Date fechaFin;

    public ProyectoInvestigacion(String nombre, float presupuesto, Date fechaInicio, Date fechaFin) {
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
