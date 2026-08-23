/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5_tp1;

/**
 *
 * @author USUARIO
 */
public class PlatoServido {
    private Plato plato;
    private Restaurante restaurante;

    public PlatoServido(Plato plato, Restaurante restaurante) {
        this.plato = plato;
        this.restaurante = restaurante;
    }

    public Plato getPlato() { return plato; }
    public Restaurante getRestaurante() { return restaurante; }
}