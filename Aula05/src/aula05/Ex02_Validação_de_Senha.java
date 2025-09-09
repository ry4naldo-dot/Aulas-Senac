
package aula05;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex02_Validação_de_Senha {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int senha = 1234;
        
        int tent = senha;
        
        System.out.print("Digite sua senha: ");
        senha = teclado.nextInt();
        
        while (senha != 1234) {
            
            System.out.print("Tente novamente: ");
            senha = teclado.nextInt();
            
        }
        
        if (senha == 1234) {
            
            System.out.println("Senha aceita!");
            
        }
        
    }
    
}