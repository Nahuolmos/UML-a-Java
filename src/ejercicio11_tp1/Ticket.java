package ejercicio11_tp1;

import java.time.LocalDate;

public class Ticket {
    private LocalDate fecha;
    private double precio;
    private Representante representante;
    private Producto producto;
    private Cliente cliente; // Multiplicidad 0..1 (diferido)

    public Ticket(LocalDate fecha, Representante representante, Producto producto) {
        this.fecha = fecha;
        this.representante = representante;
        this.producto = producto;
        this.precio = producto.getPrecioVentaPublico();
        this.cliente = null; // Inicia sin cliente asignado
    }

    /** Completa el ticket al realizar la venta final con validación de integridad */
    public void completarVentaFinal(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("El cliente no puede ser nulo.");
        }
        if (!representante.getCarteraClientes().contains(cliente)) {
            throw new IllegalStateException("Error de integridad: El cliente " + cliente.getNombre() +
                    " no pertenece a la cartera de " + representante.getNombre());
        }
        this.cliente = cliente;
    }

    public LocalDate getFecha() { return fecha; }
    public double getPrecio() { return precio; }
}
