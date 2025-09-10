
package Aula05_Do_While;

import java.util.Scanner;


/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex03_Contagem_regressiva {
    
    public static void main(String[] args) throws InterruptedException {
        
        Scanner teclado = new Scanner(System.in);
        
        int cont = 10;
        
        do {
            
            System.out.println("Contador: "+cont);
            Thread.sleep(1000);
            cont = cont - 1;
            
        } while (cont >= 0);
       
    }
    
}
