
package aula11;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex06_Subtração_de_Matriz {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int[][]matriz = new int[3][3];
        int[][]matriz2 = new int[3][3];
        
        System.out.println("Primeira matriz: ");
        
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
        
        System.out.println("Segunda matriz: ");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                System.out.print("Elemento ["+i+"]["+j+"]: "); 
                matriz2[i][j] = teclado.nextInt();
                
            }
            
        }
        
        System.out.println("Matriz2");
        for (int[]linha : matriz2) {
            for(int elemento : linha) {
                
                System.out.print(elemento+" | ");
                
            }
            
            System.out.println();
            
        }
        
        int[][] subtracao = new int [3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                subtracao[i][j] = matriz[i][j] - matriz2[i][j];
                
            }
            
            
        }
        
        System.out.println("Subtração");
        
        for (int[]linha : subtracao) {
            for (int elemento : linha){
                
                System.out.print(elemento+" | ");
                
            }
            
            System.out.println();
            
        }
        
    }
    
}
