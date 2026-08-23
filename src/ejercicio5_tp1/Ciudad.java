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
public class Ciudad {
    private String nombre;
    private List<Restaurante> restaurantes;
    private List<Persona> personas;

    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.restaurantes = new ArrayList<>();
        this.personas = new ArrayList<>();
    }

    public void agregarRestaurante(Restaurante restaurante) {
        this.restaurantes.add(restaurante);
    }

    public void agregarPersona(Persona persona) {
        this.personas.add(persona);
    }

    public List<Restaurante> getRestaurantes() { return restaurantes; }
    public List<Persona> getPersonas() { return personas; }
    public String getNombre() { return nombre; }
}