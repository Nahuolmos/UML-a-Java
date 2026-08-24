package ejercicio8_tp1;

public class Persona {

    private String numeroSeguridadSocial;
    private String nombre;
    private String direccion;
    private String telefono;

    public Persona(String numeroSeguridadSocial, String nombre, String direccion, String telefono) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
