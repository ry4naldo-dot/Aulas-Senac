
package Aula03_Ex02_Animal;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Main {
    
    public static void main(String[] args) {
        
        Cachorro ca = new Cachorro("Mavi");
        Gato ga = new Gato("Ares");
        Passaro pa = new Passaro("Jorge");
        
        ca.emitirSom();
        ga.emitirSom();
        pa.emitirSom();
        
    }
    
}
