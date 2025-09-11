
package aula06_swithcase;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex04_Menu_de_Bebidas {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("----------------------");
        System.out.println("[1] Refrigerante");
        System.out.println("[2] Suco");
        System.out.println("[3] Água");
        int op = teclado.nextInt();
        
        switch (op) {
            
            case 1:
                System.out.println("Você escolheu o refri");
                break;
            case 2:
                System.out.println("Você escolheu o suco");
                break;
            case 3:
                System.out.println("Você escolheu a água");
                break;
            default:
                System.out.println("Opção invalida");
                
        }
        
    }
    
}
