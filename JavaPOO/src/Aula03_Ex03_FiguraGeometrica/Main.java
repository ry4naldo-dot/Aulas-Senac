
package Aula03_Ex03_FiguraGeometrica;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Main {
    public static void main(String[] args) {
        
        Circulo circulo1 = new Circulo(360);
        
        circulo1.calcularArea();
        circulo1.calcularPerimetro();
        
        Retangulo retangulo1 = new Retangulo(96.20,100.50);
        
        retangulo1.calcularArea();
        retangulo1.calcularPerimetro();
        
    }
}
