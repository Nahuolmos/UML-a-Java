package ejercicio11_tp1;

public class Producto {
    private String nombre;
    private double precioVentaPublico;

    public Producto(String nombre, double precioVentaPublico) {
        this.nombre = nombre;
        this.precioVentaPublico = precioVentaPublico;
    }

    public double getPrecioVentaPublico() { return precioVentaPublico; }
    public String getNombre() { return nombre; }
}
