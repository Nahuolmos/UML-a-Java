/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2_tp1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Pais {
    private String nombre;
    private Continente continente;
    private Ciudad capital;
    private List<Provincia> provincias;
    private List<Pais> paisesLimitrofes;

    public Pais(String nombre, Continente continente) {
        this.nombre = nombre;
        this.continente = continente;
        this.provincias = new ArrayList<>();
        this.paisesLimitrofes = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Continente getContinente() { return continente; }
    public void setContinente(Continente continente) { this.continente = continente; }

    public Ciudad getCapital() { return capital; }
    public void setCapital(Ciudad capital) { this.capital = capital; }

    public List<Provincia> getProvincias() { return provincias; }
    public void agregarProvincia(Provincia provincia) { this.provincias.add(provincia); }

    public List<Pais> getPaisesLimitrofes() { return paisesLimitrofes; }
    public void agregarPaisLimitrofe(Pais pais) { this.paisesLimitrofes.add(pais); }
}
