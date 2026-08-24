package ejercicio6_tp1;

import ejercicio6_tp1.ParqueNacional;

public abstract class Personal {

    private String dni; // PK
    private String nombre;
    private String direccion;
    private String telefono;
    private float sueldo;
    private String numSeguridadSocial;
    private ParqueNacional parque;

    public Personal(String dni, String nombre, String direccion, String telefono, float sueldo, String numSeguridadSocial, ParqueNacional parque) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.numSeguridadSocial = numSeguridadSocial;
        this.parque = parque;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public ParqueNacional getParque() {
        return parque;
    }
}
