/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4_tp1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Lote {
    private String identificador;
    private List<Mineral> minerales;
    private List<Cereal> historialSiembra;

    public Lote(String identificador) {
        this.identificador = identificador;
        this.minerales = new ArrayList<>();
        this.historialSiembra = new ArrayList<>();
    }

    public void agregarMineral(Mineral mineral) {
        this.minerales.add(mineral);
    }

    public void registrarSiembraPrevia(Cereal cereal) {
        this.historialSiembra.add(cereal);
    }

    public boolean esEspecial() {
        for (Mineral m : minerales) {
            if (m.getTipo() == TipoMineral.PRIMARIO) {
                return true;
            }
        }
        return false;
    }

    public boolean puedeSembrar(Cereal cereal) {
        for (Mineral mineralRequerido : cereal.getMineralesRequeridos()) {
            if (!this.minerales.contains(mineralRequerido)) {
                return false; 
            }
        }

        if (cereal instanceof Pastura) {
            for (Cereal siembraPrevia : historialSiembra) {
                if (siembraPrevia instanceof Pastura) {
                    return false; 
                }
            }
        }

        return true; 
    }

    public List<Cereal> aconsejarCereales(List<Cereal> cerealesDisponibles) {
        List<Cereal> recomendados = new ArrayList<>();
        for (Cereal c : cerealesDisponibles) {
            if (puedeSembrar(c)) {
                recomendados.add(c);
            }
        }
        return recomendados;
    }

    public String getIdentificador() { return identificador; }
}
