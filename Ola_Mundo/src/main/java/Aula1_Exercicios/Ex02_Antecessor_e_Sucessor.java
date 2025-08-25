
package Aula1_Exercicios;

import java.util.Scanner;


public class Ex02_Antecessor_e_Sucessor {
 
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um numero:");
        int num = teclado.nextInt();
        
      
        
        System.out.println("Antecessor: "+(num -1));
        
        System.out.println("Sucessor: "+(num + 1));
    }
    
}
