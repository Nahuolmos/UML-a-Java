package ejercicio11_tp1;

import java.time.LocalDate;

public final class Vendedor extends Representante {

    public Vendedor(String nombre, String direccion, String telefono, LocalDate fechaNacimiento, String cuitCuil, LocalDate fechaIngreso) {
        super(nombre, direccion, telefono, fechaNacimiento, cuitCuil, fechaIngreso);
    }

    @Override
    public double calcularComision(Reunion r) {
        return totalVentasPropiasDesde(r.getFechaUltima()) * (r.getPorcentajeComision() / 100.0);
    }
}
