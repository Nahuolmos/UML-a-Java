/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_tp1;

/**
 *
 * @author USUARIO
 */
public class Ciudad {
    private String nombre;
    private int habitantes;
    private double imp1, imp2, imp3, imp4, imp5;
    private double gastosMantenimiento;

    public Ciudad(String nombre, int habitantes, double imp1, double imp2, double imp3, double imp4, double imp5, double gastosMantenimiento) {
        this.nombre = nombre;
        this.habitantes = habitantes;
        this.imp1 = imp1;
        this.imp2 = imp2;
        this.imp3 = imp3;
        this.imp4 = imp4;
        this.imp5 = imp5;
        this.gastosMantenimiento = gastosMantenimiento;
    }

    public double getTotalRecaudado() {
        return imp1 + imp2 + imp3 + imp4 + imp5;
    }

    public boolean tieneDeficit() {
        return gastosMantenimiento > getTotalRecaudado();
    }

    public boolean debeSerControlada() {
        return habitantes > 100000;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getHabitantes() { return habitantes; }
    public void setHabitantes(int habitantes) { this.habitantes = habitantes; }
}
