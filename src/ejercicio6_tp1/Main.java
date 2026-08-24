package ejercicio6_tp1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("   SISTEMA DE GESTIÓN DE PARQUES NACIONALES");
        System.out.println("=================================================\n");

        // 1. Creación de Comunidades Autónomas
        ComunidadAutonoma caRioNegro = new ComunidadAutonoma("Rio Negro", "Gobierno de Rio Negro - Medio Ambiente");
        ComunidadAutonoma caNeuquen = new ComunidadAutonoma("Neuquen", "Gobierno de Neuquen - Medio Ambiente");

        // 2. Creación de Parque Nacional
        ParqueNacional huapi = new ParqueNacional("Parque Nacional Nahuel Huapi", LocalDate.of(1934, 9, 29));
        caRioNegro.agregarParque(huapi);

        System.out.println("[PARQUE]: " + huapi.getNombre() + " (Declarado: " + huapi.getFechaDeclaracion() + ")");
        System.out.println("  Organismo Gestor: " + caRioNegro.getOrganismoResponsable() + " (" + caRioNegro.getNombre() + ")\n");

        // 3. Creación de Áreas del Parque
        Area mascardi = new Area("Lago Mascardi", 270.5f, huapi);
        Area norte = new Area("Villa La Angostura / Limay", 340.2f, huapi);
        huapi.agregarArea(mascardi);
        huapi.agregarArea(norte);

        // 4. Especies (Vegetales y Animales)
        EspecieVegetal lenga = new EspecieVegetal("Nothofagus pumilio", "Lenga", true, "Septiembre-Octubre");
        EspecieAnimal huemul = new EspecieAnimal("Hippocamelus bisulcus", "Huemul", "Marzo-Mayo", TipoAlimentacion.HERBIVORA);
        EspecieAnimal puma = new EspecieAnimal("Puma concolor", "Puma", "Todo el año", TipoAlimentacion.CARNIVORA);

        // Cadena trófica
        huemul.agregarAlimento(lenga);
        puma.agregarAlimento(huemul);

        // Registrar presencia de especies en áreas
        List<PresenciaEspecie> censo = new ArrayList<>();
        censo.add(new PresenciaEspecie(mascardi, huemul, 20));
        censo.add(new PresenciaEspecie(mascardi, puma, 100));
        censo.add(new PresenciaEspecie(norte, lenga, 12000));

        System.out.println("[CENSO BIOLÓGICO Y CADENA TRÓFICA]:");
        for (PresenciaEspecie p : censo) {
            System.out.println("  - Área: " + p.getArea().getNombre() + " | Especie: " + p.getEspecie().getNombreVulgar()
                    + " (" + p.getEspecie().getNombreCientifico() + ") | Cantidad: " + p.getNumIndividuos() + " indiv.");
        }
        System.out.println("  * Dieta del " + huemul.getNombreVulgar() + ": Consume " + huemul.getSeAlimentaDe().get(0).getNombreVulgar());
        System.out.println("  * Dieta del " + puma.getNombreVulgar() + ": Consume " + puma.getSeAlimentaDe().get(0).getNombreVulgar() + "\n");

        // 5. Entradas y Personal
        Entrada entradaNorte = new Entrada(1, huapi);
        Entrada entradaSur = new Entrada(2, huapi);
        huapi.agregarEntrada(entradaNorte);
        huapi.agregarEntrada(entradaSur);

        Celador juan = new Celador("12345678A", "Juan Pérez", "CAv. del Campanario 2363", "(0298) 123-3330", 1850.00f, "SS-001122", huapi, entradaNorte);
        Guarda carlos = new Guarda("87654321B", "Carlos Gómez", "Beethoven 99", "(0298) 345-2110", 2100.00f, "SS-003344", huapi, "4x4 Todoterreno", "MA-1234-ZX", mascardi);
        Investigador elena = new Investigador("45678912C", "Dra. Elena Ramos", "Chopin 498", "(0298) 678-8830", 2800.00f, "SS-005566", huapi, "Doctora en Biología");

        huapi.contratarPersonal(juan);
        huapi.contratarPersonal(carlos);
        huapi.contratarPersonal(elena);

        // Proyecto de Investigación
        ProyectoInvestigacion proyHuemul = new ProyectoInvestigacion("Conservación Hábitat Huemul 2026", 150000.0f, LocalDate.of(2026, 1, 1), LocalDate.of(2027, 12, 31));
        elena.agregarProyecto(proyHuemul);
        elena.agregarEspecieInvestigada(huemul);

        System.out.println("[PERSONAL ASIGNADO]:");
        System.out.println("  - Celador: " + juan.getNombre() + " asignado a Entrada Nº " + juan.getEntradaAsignada().getNumero());
        System.out.println("  - Guarda: " + carlos.getNombre() + " patrullando " + carlos.getAreaAsignada().getNombre() + " en " + carlos.getTipoVehiculo() + " (" + carlos.getMatricula() + ")");
        System.out.println("  - Investigadora: " + elena.getNombre() + " (" + elena.getTitulacion() + ") liderando proyecto '" + proyHuemul.getNombre() + "' con presupuesto $" + proyHuemul.getPresupuesto() + "\n");

        // 6. Visitantes, Accesos y Alojamientos
        Visitante visitanteAna = new Visitante("11223344X", "Ana Martínez", "Calle Sol 5", "Fotógrafa");
        RegistroAcceso accesoAna = new RegistroAcceso(juan, visitanteAna, LocalDate.of(2026, 8, 23));

        Alojamiento piedrasBlancas = new Alojamiento("Puerto Piedras Blancas", 20, "Lodge 4*", huapi);
        huapi.agregarAlojamiento(piedrasBlancas);

        ReservaAlojamiento reservaAna = new ReservaAlojamiento(visitanteAna, piedrasBlancas, "Habitación 102", LocalDate.of(2026, 8, 23), LocalDate.of(2026, 8, 26));

        Excursion excursionSafari = new Excursion("EXC-001", LocalDateTime.of(2026, 8, 24, 8, 0));
        excursionSafari.agregarAlojamientoOrganizador(piedrasBlancas);
        excursionSafari.inscribirVisitante(visitanteAna);

        System.out.println("[REGISTRO DE TURISMO Y ACTIVIDADES]:");
        System.out.println("  - Registro Acceso: Visitante " + accesoAna.getVisitante().getNombre() + " registrado por Celador " + accesoAna.getCelador().getNombre() + " el " + accesoAna.getFechaHora());
        System.out.println("  - Reserva Alojamiento: " + reservaAna.getAlojamiento().getNombre() + " | Habitación: " + reservaAna.getHabitacion() + " | Huésped: " + reservaAna.getVisitante().getNombre());
        System.out.println("  - Inscripción Excursión: " + excursionSafari.getCodigo() + " (" + excursionSafari.getFecha() + ") | Participante: " + excursionSafari.getInscriptos().get(0).getNombre());
        System.out.println("\n=================================================");
        System.out.println("   EJECUCIÓN FINALIZADA CON ÉXITO");
        System.out.println("=================================================");
    }
}