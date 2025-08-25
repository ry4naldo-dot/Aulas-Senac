
package Aula1_Exercicios;

import java.util.Scanner;

public class Ex05_Conversor_de_Moedas {
 
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Quantos reais você tem na carteira?");
        double rs = teclado.nextDouble();
        
        double tax = 5.45;
        
        double dol = rs / tax;
        
        System.out.printf("U$: %.2f%n", dol);
        
    }
    
}
