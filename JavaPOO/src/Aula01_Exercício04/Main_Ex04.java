
package Aula01_Exercício04;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Main_Ex04 {
    
    public static void main(String[] args) {
        
        Retangulo retangulo1 = new Retangulo();
        retangulo1.base = 96.20;
        retangulo1.altura = 100.50;
        
        System.out.println(retangulo1.calcularArea());
        System.out.println(retangulo1.calcularPerimetro());
        
    }
    
}
