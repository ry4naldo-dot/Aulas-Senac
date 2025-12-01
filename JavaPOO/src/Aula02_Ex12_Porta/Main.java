
package Aula02_Ex12_Porta;

/**
 *
 * @author Ryan
 */
public class Main {
    
    public static void main(String[] args) {
        
        Porta porta = new Porta("Azul");
        porta.abrir();
        System.out.println("Porta aberta? "+porta.isAberta()+" | Cor: "+porta.getCor());
        
    }
    
}
