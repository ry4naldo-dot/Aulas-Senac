
package Aula1_Lista_de_Exercicios2;

import java.util.Scanner;


public class Ex04_GrausCelsius_para_Fahrenheit {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um numero em C°: ");
        double c = teclado.nextDouble();
        
        double f = (c * 9 / 5 + 32);
        
        System.out.printf("F°= %.2f%n",f);
       
    }
    
}
