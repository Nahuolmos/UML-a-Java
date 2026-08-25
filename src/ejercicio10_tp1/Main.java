package ejercicio10_tp1;

public class Main {
    public static void main(String[] args) {
        Sede sedeMendoza = new Sede(1500000.0);

        Complejo mono = new Monodeportivo("Parque San Martín", "Juan Pérez", 1200.0, "Natación");
        sedeMendoza.agregarComplejo(mono);

        System.out.println("Número de complejos en la sede: " + sedeMendoza.nroComplejos());
        System.out.println("Tipo de info: " + mono.tipoInfo());
    }
}