
package Aula03_Ex11_Formas;

/**
 *
 * @author Ryan
 */
public class Main {
    
    public static void main(String[] args) {
        
        Forma quadrado = new Quadrado(4);
        System.out.println("Quadrado:");
        System.out.println("Área: "); quadrado.calcularArea();
        System.out.println("Perímetro: "); quadrado.calcularPerimetro();

        Forma triangulo = new Triangulo(5, 3, 5, 4, 3);
        System.out.println("\nTriângulo:");
        System.out.println("Área: ");  triangulo.calcularArea();
        System.out.println("Perímetro: "); triangulo.calcularPerimetro();

        Forma circulo = new Circuo(2.5);
        System.out.println("\nCírculo:");
        System.out.println("Área: ");  circulo.calcularArea();
        System.out.println("Perímetro:" );  circulo.calcularPerimetro();
        
    }
    
}
