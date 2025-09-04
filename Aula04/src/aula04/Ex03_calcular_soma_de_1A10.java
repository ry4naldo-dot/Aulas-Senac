
package aula04;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex03_calcular_soma_de_1A10 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int soma = 0;
        
        for (int i = 1; i <= 10; i++) {
            
         System.out.print("Digite um número: ");
         int n = teclado.nextInt();
        
         if (n >= 0 && n <= 10) {
             
             soma += n;
             
         }
         
        }
        
        System.out.println("A soma dos números entre 1 a 10 são: "+soma);
        
        
    }
    
}