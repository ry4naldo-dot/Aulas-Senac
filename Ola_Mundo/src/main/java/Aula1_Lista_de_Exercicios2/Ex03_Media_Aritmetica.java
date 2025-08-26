
package Aula1_Lista_de_Exercicios2;

import java.util.Scanner;


public class Ex03_Media_Aritmetica {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero: ");
        double n1 = teclado.nextDouble();
        
        System.out.print("Digite o segundo numero: ");
        double n2 = teclado.nextDouble();
        
        System.out.print("Digite o terceiro numero: ");
        double n3 = teclado.nextDouble();
        
        double soma = n1 + n2 + n3;
        double med = soma / 3;
        
        System.out.printf("A media é:%.2f%n ",med);
       
    }
    
}
