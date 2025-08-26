
package Aula1_Lista_de_Exercicios2;

import java.util.Scanner;


public class Ex09_Juros_Simples {
  
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o capital: ");
        double C = teclado.nextDouble();
        
        System.out.print("Quantos meses: ");
        double i = teclado.nextDouble();
        
        System.out.print("Em quanto tempo: ");
        double n = teclado.nextDouble();
        
        double M = C * (1 + i/100 * n);
        
        System.out.printf("Montante: %.2f%n", M,"%");
       
    }
    
}
/*9) Juros simples: Leia capital (C), taxa em % ao mês (i) e tempo (n). 
Mostre o montante (M = C * (1+ i/100 * n)).*/