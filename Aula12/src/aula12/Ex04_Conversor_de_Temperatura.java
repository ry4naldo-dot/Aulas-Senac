
package aula12;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex04_Conversor_de_Temperatura {
    
    public static double CParaF(double celsius){
        
        return (celsius * 9/5) + 32;
        
    }
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
       
        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = teclado.nextDouble();
        
      
        double fah = CParaF(celsius);
        
       
        System.out.println(celsius+" °C equivale a "+fah+" °F");
        
    }
    
}