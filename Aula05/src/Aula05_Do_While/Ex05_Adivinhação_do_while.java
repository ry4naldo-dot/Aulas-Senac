
package Aula05_Do_While;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex05_Adivinhação_do_while {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Random rand = new Random();
        int nu;
        int comp = rand.nextInt(100) + 1;
        int tent = 0;
        
        do {
            
            System.out.println("Digite um número de 1 a 100: ");
            nu = teclado.nextInt();
            
            tent++;
            
            if (nu > 100 || nu < 0) {
                
                System.out.println("===== 1 A 100 =====");
                
            } else if (nu > comp) {
                
                System.out.println("----- Menor -----");
                
            } else if (nu < comp) {
                
                System.out.println("----- Maior -----");
                
            }
            
           
            
        } while (tent <= 7 && nu != comp);
        
        if (nu != comp) {
            
            System.out.println("PERDEU! ");
            
        } else if (nu == comp) {
            
            System.out.println("Parabens, você ganhou!");
            System.out.println("Você venceu depois de "+tent+" tentativas");
            
        }
                    
        System.out.println("O número da maquina era: "+comp);
        
    }
    
}
