
package Aula01_Exercício05;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Main_Ex05 {
    
    public static void main(String[] args) {
        
        Circulo circulo1 = new Circulo();
        circulo1.raio = 360;
        
        System.out.println(circulo1.calcularArea());
        System.out.println(circulo1.calcularCircunferencia());
        
    }
    
}
