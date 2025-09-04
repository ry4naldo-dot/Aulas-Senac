
package aula04;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex04_Impares_de_9A1_ordem_descrescente {
   
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 10; i >= 1; i--) {
          
           if (i % 2 == 1) {
            
            System.out.println(i);
            
           }
           
        }
       
    }
    
}