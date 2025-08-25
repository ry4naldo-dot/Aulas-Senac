
package Aula1_Exercicios;

import java.util.Scanner;


public class Ex04_Conversor_de_Medidas {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um metro: ");
        double m = teclado.nextDouble();
        
        double cm = m * 100;
        
        double km = m / 1000;
        
        System.out.println(cm+" Cm");
        
        System.out.println(km+" Km");
       
    }
    
}
