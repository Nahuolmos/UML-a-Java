/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4_tp1;

import java.util.Objects;

/**
 *
 * @author USUARIO
 */
public class Mineral {
    private String nombre;
    private TipoMineral tipo;

    public Mineral(String nombre, TipoMineral tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public TipoMineral getTipo() { return tipo; }
    public void setTipo(TipoMineral tipo) { this.tipo = tipo; }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.nombre);
        hash = 83 * hash + Objects.hashCode(this.tipo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mineral other = (Mineral) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return this.tipo == other.tipo;
    }
}
