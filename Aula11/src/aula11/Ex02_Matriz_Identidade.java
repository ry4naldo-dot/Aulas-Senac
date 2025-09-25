
package aula11;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex02_Matriz_Identidade {
    
    public static void main(String[] args) {
        
        int[][]matriz = {
            
            {1,0,0},
            {0,1,0},
            {0,0,1}
            
        };
        
        System.out.println("Matriz");
        for (int[]linha : matriz) {
            for(int elemento : linha) {
                
                System.out.print(elemento+" | ");
                
            }
            
            System.out.println();
            
        }
        
    }
    
}
