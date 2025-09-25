
package aula11;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex03_Matriz_Transportada {
    
    public static void main(String[] args) {
        
         int[][]matriz = {
            
            {1,2,3},
            {4,5,6},
            {7,8,9}
            
        };
        
        System.out.println("Matriz antes: ");
        for (int[]linha : matriz) {
            for(int elemento : linha) {
                
                System.out.print(elemento+" | ");
                
            }
            
            System.out.println();
            
        }
      
        int [][]matriztransp = matriz; 
        
        System.out.println("Matriz depois");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                System.out.print(matriztransp[j][i]+" | ");
                
            }
            
            System.out.println();
            
        }
        
    }
    
}
