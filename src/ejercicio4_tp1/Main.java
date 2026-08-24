/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4_tp1;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        Mineral nitrogeno = new Mineral("Nitrógeno", TipoMineral.PRIMARIO);
        Lote lote = new Lote("Lote Norte");
        lote.agregarMineral(nitrogeno);
        
        CosechaGruesa maiz = new CosechaGruesa("Maíz");
        maiz.agregarMineralRequerido(nitrogeno); 
        
        System.out.println("Lote evaluado: " + lote.getIdentificador());
        System.out.println("¿El lote es especial (tiene mineral primario)?: " + lote.esEspecial());
        System.out.println("¿Se puede sembrar el maíz?: " + lote.puedeSembrar(maiz));
    }
}
