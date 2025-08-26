
package Aula1_Lista_de_Exercicios2;

import java.util.Scanner;


public class Ex02_Soma_de_dois_inteiros {
   
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("## Soma de dois inteiros ##");
        System.out.print("Digite um número: ");
        int num1 = teclado.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = teclado.nextInt();
        
        double result = num1 + num2;
        
        System.out.println("O primeiro número é: "+num1+" e o segundo é "+num2);
        System.out.println("A soma dos dois números é "+ result);
       
    }
    
}
