package ejercicio7_tp1;

public class Inscripcion {
    private Participante participante;
    private Prueba prueba;
    private String dorsal;
    private double tiempoEmpleado;
    private int posicion;

    public Inscripcion(Participante participante, Prueba prueba, String dorsal) {
        // 1. Auditoría: Correlación de Tipos
        if (!prueba.admite(participante)) {
            throw new IllegalArgumentException("Error de Correlación: La prueba '"
                    + prueba.getNombre() + "' no admite este tipo de participante.");
        }

        // 2. Disparo de Restricción {XOR}
        if (participante instanceof Esquiador) {
            ((Esquiador) participante).fijarModo(Modo.INDIVIDUAL);
        }

        this.participante = participante;
        this.prueba = prueba;
        this.dorsal = dorsal;
    }

    public String getCodigoAsignado() {
        return prueba.getNombre() + "-" + dorsal;
    }
}
