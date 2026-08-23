/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5_tp1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Persona {
    private String nombre;
    private List<Restaurante> restaurantesFrecuentes;
    private List<PlatoServido> platosFavoritos;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.restaurantesFrecuentes = new ArrayList<>();
        this.platosFavoritos = new ArrayList<>();
    }

    public void agregarRestauranteFrecuente(Restaurante restaurante) {
        this.restaurantesFrecuentes.add(restaurante);
    }

    public void agregarPlatoFavorito(PlatoServido platoServido) {
        this.platosFavoritos.add(platoServido);
    }

    public List<Restaurante> getRestaurantesFrecuentes() { return restaurantesFrecuentes; }
    public List<PlatoServido> getPlatosFavoritos() { return platosFavoritos; }
    public String getNombre() { return nombre; }
}
