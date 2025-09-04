
package aula04;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex06_caracter_repetido {
  
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a palavra para repetir: ");
        String pal = teclado.nextLine();
        
        System.out.println("Digite quantas vezes você quer repetir essa palavra: ");
        int n = teclado.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
            System.out.println(pal);
            
        }
        
    }
    
}