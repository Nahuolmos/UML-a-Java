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
public class Restaurante {
    private String nombre;
    private List<Sucursal> sucursales;
    private List<Plato> platosOfrecidos;

    public Restaurante(String nombre) {
        this.nombre = nombre;
        this.sucursales = new ArrayList<>();
        this.platosOfrecidos = new ArrayList<>();
    }

    public void agregarSucursal(Sucursal sucursal) {
        this.sucursales.add(sucursal);
    }

    // Método que aplica la regla de negocio de un máximo de 20 platos
    public boolean agregarPlato(Plato plato) {
        if (this.platosOfrecidos.size() < 20) {
            this.platosOfrecidos.add(plato);
            return true;
        } else {
            System.out.println("No se pueden agregar más de 20 platos al restaurante.");
            return false;
        }
    }

    public List<Sucursal> getSucursales() { return sucursales; }
    public List<Plato> getPlatosOfrecidos() { return platosOfrecidos; }
    public String getNombre() { return nombre; }
}