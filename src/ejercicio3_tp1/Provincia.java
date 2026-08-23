/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_tp1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Provincia {
    private String nombre;
    private List<Ciudad> ciudades;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }

    public void agregarCiudad(Ciudad ciudad) {
        this.ciudades.add(ciudad);
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public boolean tieneMayoriaCiudadesEnDeficit() {
        if (ciudades.isEmpty()) {
            return false;
        }
        
        int ciudadesConDeficit = 0;
        for (Ciudad c : ciudades) {
            if (c.tieneDeficit()) {
                ciudadesConDeficit++;
            }
        }
        
        return ciudadesConDeficit > (ciudades.size() / 2.0);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}
