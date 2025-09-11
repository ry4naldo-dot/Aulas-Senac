
package aula06_swithcase;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex05_Calculo_de_IMC {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("--------------------------");
        System.out.println("Massa(kg): ");
        double massa = teclado.nextDouble();
        
        System.out.println("Altura(m): ");
        double altura = teclado.nextDouble();
        double imc = massa / (altura * altura);
        System.out.printf("IMC: %.2f%n",imc);
        
        int clas = 0;
        
         if (imc < 17) {
            
            clas = 1;
            
        } else if (imc < 18.5) {
            
            clas = 2;
            
        } else if (imc < 25) {
            
            clas = 3;
            
        } else if (imc < 30) {
            
            clas = 4;
            
        } else if (imc < 35) {
            
            clas = 5;
            
        } else if (imc < 40) {
            
            clas = 6;
            
        } 
        
        
        switch (clas) {
            
            case 1:
                System.out.println("Muito abaixo do peso");
                break;
            case 2:
                System.out.println("Abaixo do peso");
                break;
            case 3:
                System.out.println("Peso ideal");
                break;
            case 4:
                System.out.println("Sobrepeso");
                break;
            case 5:
                System.out.println("Obesidade");
                break;
            case 6:
                System.out.println("Obesidade severa");
                break;
            default:    
                System.out.println("Obesidade mórbida");
                break;
                
        }
        
    }
    
}