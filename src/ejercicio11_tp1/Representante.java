package ejercicio11_tp1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Representante {
    private String nombre;
    private String direccion;
    private String telefono;
    private LocalDate fechaNacimiento;
    private String cuitCuil;
    private LocalDate fechaIngreso;

    private final List<Cliente> carteraClientes = new ArrayList<>();
    private final List<Ticket> ticketsEmitidos = new ArrayList<>();

    public Representante(String nombre, String direccion, String telefono, LocalDate fechaNacimiento, String cuitCuil, LocalDate fechaIngreso) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.cuitCuil = cuitCuil;
        this.fechaIngreso = fechaIngreso;
    }

    public void agregarClienteACartera(Cliente c) {
        carteraClientes.add(c);
    }

    public void registrarTicket(Ticket t) {
        ticketsEmitidos.add(t);
    }

    public List<Cliente> getCarteraClientes() {
        return Collections.unmodifiableList(carteraClientes);
    }

    public String getNombre() { return nombre; }

    /** Atributo Derivado: total de ventas propias desde una fecha determinada */
    public double totalVentasPropiasDesde(LocalDate fechaCorte) {
        return ticketsEmitidos.stream()
                .filter(t -> !t.getFecha().isBefore(fechaCorte))
                .mapToDouble(Ticket::getPrecio)
                .sum();
    }

    /** Método derivado y POLIMÓRFICO que redefinen las subclases */
    public abstract double calcularComision(Reunion r);
}
