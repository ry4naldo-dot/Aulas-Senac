
package aula05;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex03_Tabuada_de_um_num {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int tab = 1;
        
        System.out.print("Digite um número para a tabuada: ");
        int n = teclado.nextInt();
        
        if (n > 0) {
            
          while (tab <= 10) {
              
              System.out.println(n * tab);
              
              tab += 1;
              
          }
            
        } else {
            
            System.out.println("Número inválido, digite um valor positivo.");
            
        }
        
    }
    
}