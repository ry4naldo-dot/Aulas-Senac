
package Aula06_semCalculo;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex05_Navegação_em_Aplicativo {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("===============================");
        System.out.println("     [1] Página inicial");
        System.out.println("     [2] Perfil");
        System.out.println("     [3] Configurações");
        System.out.println("     [4] Notificações");
        System.out.println("     [5] Sair");
        int op = teclado.nextInt();
        System.out.println("===============================");
        
        switch (op) {
            
            case 1:
                System.out.println("Você está na página: ---Página inicial---");
                break;
            case 2:
                System.out.println("Você está na página: ---Perfil---");
                break;
            case 3:
                System.out.println("Você está na página: ---Configurações---");
                break;
            case 4:
                System.out.println("Você está na página: ---Notificações---");
                break;
            case 5:
                System.out.println("Aplicativo encerrado");
                break;
            default:    
                System.out.println("Opção inválida");
                
        }
        
        
    }
    
}