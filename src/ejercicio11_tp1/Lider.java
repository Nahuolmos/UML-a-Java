package ejercicio11_tp1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Lider extends Representante {
    private LocalDate fechaPromocion;
    private final List<Vendedor> equipo = new ArrayList<>(); // Relación coordina dentro de la jerarquía

    public Lider(String nombre, String direccion, String telefono, LocalDate fechaNacimiento, String cuitCuil, LocalDate fechaIngreso, LocalDate fechaPromocion) {
        super(nombre, direccion, telefono, fechaNacimiento, cuitCuil, fechaIngreso);
        this.fechaPromocion = fechaPromocion;
    }

    public void agregarAlEquipo(Vendedor v) {
        equipo.add(v);
    }

    @Override
    public double calcularComision(Reunion r) {
        // 1. Comisión sobre sus ventas propias
        double comisionPropia = totalVentasPropiasDesde(r.getFechaUltima()) * (r.getPorcentajeComision() / 100.0);

        // 2. ADEMÁS: Comisión sobre el total de ventas de su equipo
        double comisionEquipo = equipo.stream()
                .mapToDouble(v -> v.totalVentasPropiasDesde(r.getFechaUltima()))
                .sum() * (r.getPorcentajeComision() / 100.0);

        return comisionPropia + comisionEquipo;
    }
}