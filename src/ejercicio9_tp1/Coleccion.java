package ejercicio9_tp1;

public class Coleccion {

    private String nombre;
    private TipoColeccion tipo;
    private String descripcion;
    private String direccion;
    private String telefono;
    private String personaContacto;

    public Coleccion(String nombre, TipoColeccion tipo, String descripcion, String direccion, String telefono, String personaContacto) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.personaContacto = personaContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoColeccion getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getPersonaContacto() {
        return personaContacto;
    }
}
