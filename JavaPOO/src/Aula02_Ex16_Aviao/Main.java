
package Aula02_Ex16_Aviao;

/**
 *
 * @author Ryan
 */
public class Main {
    
    public static void main(String[] args) {
        
        Aviao aviao = new Aviao("Boeing 737", 180, 850);
        System.out.println("Avião: "+aviao.getModelo()+" | Capacidade: "+aviao.getCapacidadePassageiros());

    }
    
}
