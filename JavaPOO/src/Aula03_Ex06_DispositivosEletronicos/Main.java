
package Aula03_Ex06_DispositivosEletronicos;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Main {
    
    public static void main(String[] args) {
        
        Televisao tv = new Televisao();
        tv.ligar();
        tv.obterStatus();
        
        Radio ra = new Radio();
        ra.ligar();
        ra.desligar();
        ra.obterStatus();
        
        Celular ce =new Celular();
        ce.ligar();
        ce.desligar();
        ce.ligar();
        ce.obterStatus();
        
    }
    
}
