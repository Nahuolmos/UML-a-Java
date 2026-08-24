package ejercicio6_tp1;

class Entrada {
    private int numero; 
    private ParqueNacional parque;

    public Entrada(int numero, ParqueNacional parque) {
        this.numero = numero;
        this.parque = parque;
    }

    public int getNumero() {
        return numero;
    }

    public ParqueNacional getParque() {
        return parque;
    }
}
