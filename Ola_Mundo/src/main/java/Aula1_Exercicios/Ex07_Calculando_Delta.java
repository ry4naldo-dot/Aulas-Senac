
package Aula1_Exercicios;

import java.util.Scanner;


public class Ex07_Calculando_Delta {
  
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
       
        System.out.print("Digite o valor de a: ");
        double a = teclado.nextDouble();
        
        System.out.print("Digite o valor de b: ");
        double b = teclado.nextDouble();
        
        System.out.print("Digite o valor de c: ");
        double c = teclado.nextDouble();
        
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("Não existem raízes reais.");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            
            System.out.println("O resultado para x' é: " + x1);
            System.out.println("O resultado para x'' é: " + x2);
        }
    }
    
}