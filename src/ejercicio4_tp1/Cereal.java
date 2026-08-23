/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4_tp1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public abstract class Cereal {
    private String nombre;
    private List<Mineral> mineralesRequeridos;

    public Cereal(String nombre) {
        this.nombre = nombre;
        this.mineralesRequeridos = new ArrayList<>();
    }

    public void agregarMineralRequerido(Mineral mineral) {
        this.mineralesRequeridos.add(mineral);
    }

    public List<Mineral> getMineralesRequeridos() { return mineralesRequeridos; }
    public String getNombre() { return nombre; }
}
