/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5_tp1;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        Restaurante rest = new Restaurante("Tommys Bar");
        Plato lomo = new Plato("Lomo completo");
        rest.agregarPlato(lomo);
        
        Persona persona = new Persona("Facu");
        PlatoServido preferencia = new PlatoServido(lomo, rest);
        persona.agregarPlatoFavorito(preferencia);
        
        System.out.println("Gusto registrado para: " + persona.getNombre());
        System.out.println("Plato favorito: " + persona.getPlatosFavoritos().get(0).getPlato().getNombre());
        System.out.println("Preparado en: " + persona.getPlatosFavoritos().get(0).getRestaurante().getNombre());
    }
}
