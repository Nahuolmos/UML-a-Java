package ejercicio7_tp1;

import java.time.LocalDate;
import java.time.Period;

public final class Esquiador extends Participante {
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private Modo modo = Modo.SIN_DEFINIR;

    public Esquiador(String dni, String nombre, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }

    /** Restricción {XOR}: rechaza si ya eligió el otro modo. */
    public void fijarModo(Modo nuevo) {
        if (this.modo != Modo.SIN_DEFINIR && this.modo != nuevo) {
            throw new IllegalStateException("Restriccion {XOR}: ya participa en modo " + this.modo);
        }
        this.modo = nuevo;
    }

    @Override
    public boolean acepta(Prueba prueba) {
        return prueba instanceof PruebaIndividual;
    }
}