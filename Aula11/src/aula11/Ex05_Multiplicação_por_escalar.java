
package aula11;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex05_Multiplicação_por_escalar {
    
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        int[][]matriz = new int[3][3];
        
        System.out.print("Digite um número para escalar: ");
        int escalar = teclado.nextInt();
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                System.out.print("Elemento ["+i+"]["+j+"]: "); 
                matriz[i][j] = teclado.nextInt();
                matriz[i][j] *= escalar;
                
            }
            
        }
        
        System.out.println("Matriz");
        for (int[]linha : matriz) {
            for(int elemento : linha) {
                
                System.out.print(elemento+" | ");
                
            }
            
            System.out.println();
            
        }
        
    }
    
}
