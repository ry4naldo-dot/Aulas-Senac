
package Aula06_semCalculo;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex01_login_com_user {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("=-=-=-=-=-=-=-=-=-=");
        System.out.println("[1] Administração");
        System.out.println("[2] Editor");
        System.out.println("[3] Visitante");
        int op = teclado.nextInt();
        System.out.println("=-=-=-=-=-=-=-=-=-=");
        
        switch (op) {
            
            case 1:
                System.out.println("Administrador: Você pode criar, editar e excluir.");
                break;
            case 2:
                System.out.println("Edior: Você pode criar e editar.");
                break;
            case 3:
                System.out.println("Visitante: Você pode apenas visualizar.");
                break;
            default:
                System.out.println("Opção invalida");
                
        }
        
    }
    
}
