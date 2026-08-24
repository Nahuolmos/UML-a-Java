package ejercicio8_tp1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Aerodromo aerodromo = new Aerodromo("Aeródromo San Jorge");

        TipoAvion cessna172 = new TipoAvion(172, 3, 1111f);
        TipoAvion piper28 = new TipoAvion(28, 4, 1150f);

        Hangar hangarNorte = aerodromo.crearHangar(1, 2, "Zona Norte");
        Hangar hangarSur = aerodromo.crearHangar(2, 1, "Zona Sur");

        Persona juan = new Persona("20-12345678-9", "Juan Pérez", "Av. San Martín 742", "+54 3751 555101");
        Mecanico carlos = new Mecanico("20-88888888-1", "Carlos Gómez", "Calle 12 Nº 340", "+54 3751 555102", 850000f, Turno.MANANA);
        Mecanico ana = new Mecanico("20-77777777-2", "Ana Ruiz", "Calle 9 Nº 210", "+54 3751 555103", 900000f, Turno.TARDE);
        Piloto luis = new Piloto("20-66666666-3", "Luis Díaz", "Ruta 12 Km 5", "+54 3751 555104", "AR-998877", "Solo vuelo visual (VFR)");

        carlos.autorizarTipo(cessna172);
        ana.autorizarTipo(cessna172);
        ana.autorizarTipo(piper28);
        luis.autorizarTipo(cessna172);
        luis.autorizarTipo(piper28);

        Avion cessna = new Avion("LV-ABC", cessna172);
        hangarNorte.estacionar(cessna);
        cessna.venderA(juan, LocalDate.of(2020, 5, 10));

        Avion piper = new Avion("LV-XYZ", piper28);
        hangarSur.estacionar(piper);
        piper.venderA(luis, LocalDate.of(2019, 11, 2));

        RegistroServicio revision = cessna.registrarServicio(carlos, LocalDate.of(2026, 3, 1), 4.5f, TipoTrabajo.REVISION);

        try {
            cessna.registrarServicio(ana, LocalDate.of(2026, 3, 1), 2f, TipoTrabajo.REVISION);
        } catch (IllegalStateException e) {
            System.out.println("Servicio rechazado: " + e.getMessage());
        }

        try {
            piper.registrarServicio(carlos, LocalDate.of(2026, 3, 2), 3f, TipoTrabajo.REPARACION);
        } catch (IllegalArgumentException e) {
            System.out.println("Servicio rechazado: " + e.getMessage());
        }

        piper.registrarServicio(ana, LocalDate.of(2026, 3, 2), 3f, TipoTrabajo.REPARACION);

        Hangar hangarChico = aerodromo.crearHangar(3, 1, "Zona Este");
        Avion extra = new Avion("LV-456", cessna172);
        hangarChico.estacionar(extra);
        extra.venderA(juan, LocalDate.of(2023, 8, 15));
        try {
            Avion sobrante = new Avion("LV-789", piper28);
            hangarChico.estacionar(sobrante);
        } catch (IllegalStateException e) {
            System.out.println("Estacionamiento rechazado: " + e.getMessage());
        }

        System.out.println(aerodromo.getNombre() + ":");
        for (Hangar hangar : aerodromo.getHangares()) {
            System.out.println(" - Hangar " + hangar.getNumero() + " (" + hangar.getUbicacion() + ") con " + hangar.cuantosAvionesTiene() + "/" + hangar.getCapacidad() + " aviones");
            for (Avion avion : hangar.getAviones()) {
                System.out.println("   * " + avion.getMatricula() + ", modelo " + avion.getTipo().getNumeroModelo() + ", propiedad de " + avion.getPropiedadActual().getPropietario().getNombre() + " desde " + avion.getPropiedadActual().getFechaAdquisicion());
            }
        }
        System.out.println(revision.getMecanico().getNombre() + " hizo una " + revision.getTipoTrabajo() + " de " + revision.getHorasInvertidas() + " horas al " + revision.getAvion().getMatricula());
        System.out.println(ana.getNombre() + " (turno " + ana.getTurno() + ") realizó " + ana.getServiciosRealizados().size() + " servicios");
        System.out.println(luis.getNombre() + " está autorizado para volar " + luis.getTiposAutorizados().size() + " tipos de avión");
    }
}
