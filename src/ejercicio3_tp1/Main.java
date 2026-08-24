/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_tp1;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        Ciudad metropolis = new Ciudad("Metrópolis", 150000, 10, 10, 10, 10, 10, 100);
        
        System.out.println("Ciudad: " + metropolis.getNombre());
        System.out.println("Total recaudado: $" + metropolis.getTotalRecaudado());
        System.out.println("¿Debe ser controlada (más de 100k hab)?: " + metropolis.debeSerControlada());
        System.out.println("¿Tiene déficit (gasta más de lo que recauda)?: " + metropolis.tieneDeficit());
    }
}
