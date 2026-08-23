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
public class Pais {
    private String nombre;
    private List<Provincia> provincias;

    public Pais(String nombre) {
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
    }

    public void agregarProvincia(Provincia provincia) {
        this.provincias.add(provincia);
    }

    public List<Ciudad> getCiudadesAControlar() {
        List<Ciudad> ciudadesAControlar = new ArrayList<>();
        
        for (Provincia p : provincias) {
            for (Ciudad c : p.getCiudades()) {
                if (c.debeSerControlada() && c.tieneDeficit()) {
                    ciudadesAControlar.add(c);
                }
            }
        }
        return ciudadesAControlar;
    }

    public List<Provincia> getProvinciasEnDeficit() {
        List<Provincia> provinciasEnDeficit = new ArrayList<>();
        
        for (Provincia p : provincias) {
            if (p.tieneMayoriaCiudadesEnDeficit()) {
                provinciasEnDeficit.add(p);
            }
        }
        return provinciasEnDeficit;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}
