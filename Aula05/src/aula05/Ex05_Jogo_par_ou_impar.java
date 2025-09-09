
package aula05;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex05_Jogo_par_ou_impar {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String esc = " ";
        
        int user, comp, soma;
        
        Random rand = new Random();
        
        while (!"sair".equalsIgnoreCase(esc)) {
            
            System.out.print("Escolha 'par' ou 'impar'(digite 'sair' para encerrar): ");
            esc = teclado.next();
            
            if (!"sair".equalsIgnoreCase(esc)) {
                
                System.out.println("Digite um número de 1 a 5: ");
                user = teclado.nextInt();
                
                if (user >= 0 && user <= 5){
                    
                    comp = rand.nextInt(5) + 1;
                    
                    soma = user + comp;
                    
                    System.out.println("Você jogou "+user+", o computador jogou "+comp);
                    
                    System.out.println("Soma = "+soma);
                    
                    if ((soma % 2 == 0 && "par".equalsIgnoreCase(esc)) || (soma % 2 != 0 && "impar".equalsIgnoreCase(esc))) {
                        
                        System.out.println("Você venceu!");
                        
                    } else {
                        
                        System.out.println("O computador venceu");
                        
                    }
                    
                } else {
                    
                    System.out.println("Número inválido. Digite entre 1 e 5.");
                    
                }
                
            }
            
        }
        
        System.out.println("Acabou o jogo.");
        
    }
    
}