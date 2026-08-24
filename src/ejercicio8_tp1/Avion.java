package ejercicio8_tp1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Avion {

    private String matricula;
    private TipoAvion tipo;
    private Hangar hangar;
    private List<Propiedad> propiedades;
    private List<RegistroServicio> servicios;

    public Avion(String matricula, TipoAvion tipo) {
        this.matricula = matricula;
        this.tipo = tipo;
        this.propiedades = new ArrayList<>();
        this.servicios = new ArrayList<>();
    }

    public Propiedad venderA(Persona comprador, LocalDate fechaAdquisicion) {
        Propiedad propiedad = new Propiedad(this, comprador, fechaAdquisicion);
        propiedades.add(propiedad);
        return propiedad;
    }

    public Propiedad getPropiedadActual() {
        return propiedades.isEmpty() ? null : propiedades.get(propiedades.size() - 1);
    }

    public RegistroServicio registrarServicio(Mecanico mecanico, LocalDate fecha, float horasInvertidas, TipoTrabajo tipoTrabajo) {
        if (!mecanico.estaAutorizadoPara(tipo)) {
            throw new IllegalArgumentException("El mecánico " + mecanico.getNombre() + " no está autorizado para dar mantenimiento a este tipo de avión.");
        }
        for (RegistroServicio servicio : servicios) {
            if (servicio.getFecha().equals(fecha) && servicio.getTipoTrabajo() == tipoTrabajo) {
                throw new IllegalStateException("Ya existe un servicio de tipo " + tipoTrabajo + " para el avión " + matricula + " en la fecha " + fecha + ".");
            }
        }
        RegistroServicio servicio = new RegistroServicio(this, mecanico, fecha, horasInvertidas, tipoTrabajo);
        servicios.add(servicio);
        mecanico.agregarRegistro(servicio);
        return servicio;
    }

    void asignarHangar(Hangar hangar) {
        this.hangar = hangar;
    }

    public String getMatricula() {
        return matricula;
    }

    public TipoAvion getTipo() {
        return tipo;
    }

    public Hangar getHangar() {
        return hangar;
    }

    public List<Propiedad> getPropiedades() {
        return propiedades;
    }

    public List<RegistroServicio> getServicios() {
        return servicios;
    }
}
