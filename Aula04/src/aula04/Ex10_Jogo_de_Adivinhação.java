
package aula04;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex10_Jogo_de_Adivinhação {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Random rand = new Random();
        int min = 1;
        int max = 100;
        int comp = rand.nextInt(max - min + 1) + min;// (100)+1
        int tent = 0;
        
        System.out.print("Digite um numero de 1 a 100: ");
        int nu = teclado.nextInt();
        
        for (int i = 1; i <= 7; i++) {
            
            
            
            if (nu > 100 || nu < 0) {
            
                System.out.print("===== 1 A 100! =====");
            
        } else if (comp < nu) {
            
                System.out.println("----- Menor -----");
            
        } else if (comp > nu) {
            
                System.out.println("----- Maior -----");
            
        } else if (comp == nu) {
            
                System.out.println("Parabens, você ganhou!");
                break;
            
        }
         
            System.out.print("Digite um numero de 1 a 100: ");
            nu = teclado.nextInt();
            
        }
        
        if (comp != nu) {
            
            System.out.println("PERDEU!");
            
        }
        
        System.out.println("O numero da maquina era: "+comp);
        
    }
    
}