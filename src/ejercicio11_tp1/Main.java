package ejercicio11_tp1;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Crear reunión con 10% de comisión
        Reunion reunion = new Reunion(LocalDate.of(2026, 8, 1), LocalDate.of(2026, 9, 1), 10.0);

        // 2. Crear representantes
        Vendedor vendedor = new Vendedor("Ana López", "Calle 123", "261111111", LocalDate.of(2000, 1, 1), "27400000008", LocalDate.of(2025, 1, 1));
        Lider lider = new Lider("Carlos Gómez", "Av. San Martín 456", "261222222", LocalDate.of(1995, 5, 10), "20380000002", LocalDate.of(2024, 3, 1), LocalDate.of(2025, 6, 1));

        lider.agregarAlEquipo(vendedor);

        // 3. Crear productos y registrar ventas
        Producto crema = new Producto("Crema Facial Exfoliante", 15000.0);

        Ticket t1 = new Ticket(LocalDate.of(2026, 8, 10), vendedor, crema);
        vendedor.registrarTicket(t1);

        Ticket t2 = new Ticket(LocalDate.of(2026, 8, 15), lider, crema);
        lider.registrarTicket(t2);

        // 4. Probar despacho polimórfico de comisiones
        List<Representante> fuerzaDeVentas = List.of(vendedor, lider);

        System.out.println("--- RENDICIÓN DE COMISIONES ---");
        for (Representante rep : fuerzaDeVentas) {
            System.out.println("Representante: " + rep.getNombre() + " | Comisión: $" + rep.calcularComision(reunion));
        }
    }
}