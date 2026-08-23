/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1_tp1;

/**
 *
 * @author Lenovo
 */
public class Lado {
    private Punto p1;
    private Punto p2;

    public Lado(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Punto getP1() { return p1; }
    public void setP1(Punto p1) { this.p1 = p1; }

    public Punto getP2() { return p2; }
    public void setP2(Punto p2) { this.p2 = p2; }
}
