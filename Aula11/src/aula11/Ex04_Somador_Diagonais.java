
package aula11;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex04_Somador_Diagonais {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int[][]matriz = new int[3][3];
        
        int somaPrinc = 0;
        int somaSec = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                System.out.print("Elemento ["+i+"]["+j+"]: "); 
                matriz[i][j] = teclado.nextInt();
                
            }
            
            somaPrinc += matriz[i][i];
            somaSec += matriz[i][2-i];
            
        }
        
        System.out.println("Matriz");
        for (int[]linha : matriz) {
            for(int elemento : linha) {
                
                System.out.print(elemento+" | ");
                
            }
            
            System.out.println();
            
        }
        
        System.out.println("Soma da primeira "+somaPrinc);
        System.out.println("Soma da secundaria "+somaSec);
        
    }
    
}
