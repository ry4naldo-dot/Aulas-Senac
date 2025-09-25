
package aula11;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex01_Somados_Elementos {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int[][]matriz = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                System.out.print("Elemento ["+i+"]["+j+"]: "); 
                matriz[i][j] = teclado.nextInt();
                
            }
            
        }
        
        System.out.println("Matriz");
        for (int[]linha : matriz) {
            for(int elemento : linha) {
                
                System.out.print(elemento+" | ");
                
            }
            
            System.out.println();
            
        }
        
        for (int i = 0; i < 3; i++) {
            int somaLinha = 0;
            int somaColuna = 0;
            
            for (int j = 0; j < 3; j++) {
                
                somaLinha += matriz[i][1-i];
                somaColuna += matriz[j][i];
                
            }
            
            System.out.println("Soma da linha "+(i+1)+" : "+somaLinha);
            System.out.println("Soma da coluna "+(i+1)+" : "+somaColuna);
        }
        
    }
    
}
