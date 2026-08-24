/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1_tp1;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado();
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(0, 2);
        Lado lado1 = new Lado(p1, p2);
        
        cuadrado.agregarLado(lado1);
        
        System.out.println("Lados registrados en el cuadrado: " + cuadrado.getCantidadDeLados());
    }
}