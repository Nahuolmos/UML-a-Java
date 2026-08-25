package ejercicio7_tp1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== CAMPEONATO DE ESQUÍ ===\n");

        // Datos de prueba
        Esquiador esquiador1 = new Esquiador("11111111", "Juan Perez", LocalDate.of(2000, 5, 15));
        Esquiador esquiador2 = new Esquiador("22222222", "Ana Lopez", LocalDate.of(1998, 8, 20));
        Esquiador esquiador3 = new Esquiador("33333333", "Carlos Rey", LocalDate.of(2001, 1, 10));

        Equipo equipoA = new Equipo("EQ-01", "Marcos DT");
        
        PruebaIndividual pruebaSlalom = new PruebaIndividual("Slalom Gigante");
        PruebaEquipo pruebaRelevos = new PruebaEquipo("Relevos 4x400");

        System.out.println("--- PRUEBAS DE ÉXITO ---");
        try {
            Inscripcion inscripcion1 = new Inscripcion(esquiador1, pruebaSlalom, "DORSAL-101");
            System.out.println("ÉXITO: Esquiador inscrito en individual. Código asignado: " + inscripcion1.getCodigoAsignado());

            equipoA.agregarEsquiador(esquiador2);
            Inscripcion inscripcion2 = new Inscripcion(equipoA, pruebaRelevos, "DORSAL-200");
            System.out.println("ÉXITO: Equipo inscrito en relevos. Código asignado: " + inscripcion2.getCodigoAsignado());
            
        } catch (Exception e) {
            System.out.println("Fallo inesperado en flujo normal: " + e.getMessage());
        }

        System.out.println("\n--- PRUEBAS DE ERROR (EXCEPCIONES ESPERADAS) ---");

        // --- CASO ERROR 1: Correlación de tipos (Equipo en prueba individual) ---
        System.out.println("\nPrueba 1: Inscribir un Equipo en una Prueba Individual");
        try {
            new Inscripcion(equipoA, pruebaSlalom, "DORSAL-999");
            System.out.println("FALLO CRÍTICO: El sistema permitió la inscripción (NO DEBERÍA PASAR).");
        } catch (IllegalArgumentException e) {
            System.out.println("BLINDADO CORRECTAMENTE -> " + e.getMessage());
        }

        // --- CASO ERROR 2: Correlación de tipos (Esquiador en prueba de equipo) ---
        System.out.println("\nPrueba 2: Inscribir un Esquiador solo en una Prueba de Equipo");
        try {
            new Inscripcion(esquiador3, pruebaRelevos, "DORSAL-998");
            System.out.println("FALLO CRÍTICO: El sistema permitió la inscripción (NO DEBERÍA PASAR).");
        } catch (IllegalArgumentException e) {
            System.out.println("BLINDADO CORRECTAMENTE -> " + e.getMessage());
        }

        // --- CASO ERROR 3: Restricción {XOR} (Pasa de Individual a Equipo) ---
        System.out.println("\nPrueba 3: Esquiador individual (Juan) intenta unirse a un equipo");
            try {
            equipoA.agregarEsquiador(esquiador1);
            System.out.println("FALLO CRÍTICO: El sistema permitió cambiar de modo (NO DEBERÍA PASAR).");
        } catch (IllegalStateException e) {
            System.out.println("BLINDADO CORRECTAMENTE -> " + e.getMessage());
        }

        // --- CASO ERROR 4: Restricción {XOR} (Pasa de Equipo a Individual) ---
        System.out.println("\nPrueba 4: Esquiador de equipo (Ana) intenta inscribirse como individual");
        try {
            new Inscripcion(esquiador2, pruebaSlalom, "DORSAL-997");
            System.out.println("FALLO CRÍTICO: El sistema permitió cambiar de modo (NO DEBERÍA PASAR).");
        } catch (IllegalStateException e) {
            System.out.println("BLINDADO CORRECTAMENTE -> " + e.getMessage());
        }
    }
}
