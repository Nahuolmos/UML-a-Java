package ejercicio9_tp1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Museo museo = new Museo("Museo Nacional de Bellas Artes");

        Coleccion accademia = new Coleccion("Galleria dell'Accademia", TipoColeccion.MUSEO, "Colección del Estado italiano en Florencia", "Via Ricasoli 58, Florencia", "+39 055 0987100", "Elena Rossi");
        Coleccion artePrecolombino = new Coleccion("Fundación Arte Precolombino", TipoColeccion.FUNDACION, "Obras mesoamericanas en depósito itinerante", "Calle Mayor 45, Madrid", "+34 915 552210", "Carlos Méndez");
        museo.registrarColeccion(accademia);
        museo.registrarColeccion(artePrecolombino);

        Artista monet = new Artista("Claude Monet", LocalDate.of(1840, 11, 14), LocalDate.of(1926, 12, 5), "Francia", "Impresionismo", "Impresionismo", "Pionero del impresionismo francés");
        Artista miguelAngel = new Artista("Miguel Ángel Buonarroti", LocalDate.of(1475, 3, 6), LocalDate.of(1564, 2, 18), "Italia", "Renacimiento", "Renacimiento", "Escultor, pintor y arquitecto del Renacimiento");
        Artista anonimoMaya = new Artista("Anónimo maya", null, null, "Guatemala", "Período Clásico", "Figurativo", "Artesano de la cultura maya");

        Pintura impresion = new Pintura(1, monet, 1872, "Impresión, sol naciente", "Marina del puerto de El Havre al amanecer", new Origen("Francia", "Francesa", "Impresionismo"), new Permanente(LocalDate.of(1985, 6, 12), 2000000f, EstadoObjeto.EXPOSICION), "Óleo", "Lienzo", "Impresionista");
        Escultura david = new Escultura(2, miguelAngel, 1504, "David", "Copia en mármol del célebre David florentino", new Origen("Italia", "Toscana", "Renacimiento"), new EnPrestamo(accademia, LocalDate.of(2026, 3, 1), LocalDate.of(2027, 3, 1)), "Mármol", 5.17f, 5600f, "Renacentista");
        ObjetoArte vaso = new ObjetoArte(3, anonimoMaya, 650, "Vaso ceremonial", "Vaso policromo con escena cortesana", new Origen("Guatemala", "Maya", "Período Clásico"), new EnPrestamo(artePrecolombino, LocalDate.of(2025, 9, 15), LocalDate.of(2026, 9, 15)));

        museo.agregarObjeto(impresion);
        museo.agregarObjeto(david);
        museo.agregarObjeto(vaso);

        Exposicion exposicion = museo.crearExposicion("Tesoros del Impresionismo y el Renacimiento", LocalDate.of(2026, 9, 1), LocalDate.of(2026, 11, 30));
        exposicion.agregarObjeto(impresion);
        exposicion.agregarObjeto(david);
        exposicion.agregarObjeto(vaso);

        System.out.println(museo.getNombre() + ":");
        for (ObjetoArte objeto : museo.getColeccion()) {
            String anio = objeto.getAnioCreacion() == null ? "año desconocido" : "creado en " + objeto.getAnioCreacion();
            String artista = objeto.getArtista().getNombre();
            System.out.println(" - [" + objeto.getNumeroIdentificacion() + "] " + objeto.getTitulo() + " de " + artista + " (" + anio + ")");
            System.out.println("   Origen: " + objeto.getOrigen().getCultura() + ", " + objeto.getOrigen().getPais() + " (" + objeto.getOrigen().getEpoca() + ")");
            if (objeto instanceof Pintura) {
                Pintura pintura = (Pintura) objeto;
                System.out.println("   Detalle: pintura al " + pintura.getTipoPintura() + " sobre " + pintura.getSoporte() + ", estilo " + pintura.getEstilo());
            } else if (objeto instanceof Escultura) {
                Escultura escultura = (Escultura) objeto;
                System.out.println("   Detalle: escultura en " + escultura.getMaterial() + ", " + escultura.getAlturaM() + " m y " + escultura.getPesoKg() + " kg, estilo " + escultura.getEstilo());
            } else {
                System.out.println("   Detalle: objeto de otro tipo");
            }
            if (objeto.esDeLaColeccionPermanente()) {
                Permanente permanente = (Permanente) objeto.getPertenencia();
                System.out.println("   Pertenencia: colección permanente, adquirida el " + permanente.getFechaAdquisicion() + " por $" + permanente.getCoste() + ", estado " + permanente.getEstado());
            } else {
                EnPrestamo prestamo = (EnPrestamo) objeto.getPertenencia();
                System.out.println("   Pertenencia: en préstamo de " + prestamo.getColeccion().getNombre() + " desde el " + prestamo.getFechaRecepcion() + ", devolución el " + prestamo.getFechaDevolucion());
            }
        }

        System.out.println("Exposición \"" + exposicion.getNombre() + "\" con " + exposicion.getObjetosExhibidos().size() + " obras, vigente hoy: " + exposicion.vigenteEn(LocalDate.now()));
    }
}
