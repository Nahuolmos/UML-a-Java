package ejercicio7_tp1;

public abstract class Prueba {
    private String nombre;
    
    public Prueba(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public abstract boolean admite(Participante p);
}
