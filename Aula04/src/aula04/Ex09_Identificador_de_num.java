
package aula04;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex09_Identificador_de_num {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); 
        
        System.out.print("Digite o 1° numero: ");
        int n = teclado.nextInt();
        
        int maior = n;
        int menor = n;
        
        for (int i = 2; i <= 7; i++) {
            
            System.out.print("Digite o "+i+"° numero: ");
            n = teclado.nextInt();
            
            if (n > maior) {
                
                maior = n;
                
            } else if (n < menor) {
                
                menor = n;
                
            }
            
        }
        
        System.out.println("O maior numero é: "+maior);
        System.out.println("O menor numero é: "+menor);
        
    }
    
}