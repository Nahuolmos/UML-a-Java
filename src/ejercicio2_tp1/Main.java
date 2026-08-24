/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2_tp1;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        Continente america = new Continente("América");
        Pais argentina = new Pais("Argentina", america);
        Provincia cordoba = new Provincia("Córdoba");
        Ciudad capital = new Ciudad("Córdoba Capital");
        
        cordoba.setCapital(capital);
        argentina.agregarProvincia(cordoba);
        argentina.setCapital(new Ciudad("Buenos Aires"));
       
        System.out.println("País: " + argentina.getNombre());
        System.out.println("Continente: " + argentina.getContinente().getNombre());
        System.out.println("Provincias registradas: " + argentina.getProvincias().size());
    }
}
