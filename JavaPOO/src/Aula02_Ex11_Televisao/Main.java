
package Aula02_Ex11_Televisao;

/**
 *
 * @author Ryan
 */
public class Main {
    
    public static void main(String[] args) {
        
        Televisao tv = new Televisao(10, 5);
        tv.aumentarVolume();
        tv.trocarCanal(12);
        System.out.println("TV - Volume: "+tv.getVolume()+", Canal: "+tv.getCanal());
        
    }
    
}
