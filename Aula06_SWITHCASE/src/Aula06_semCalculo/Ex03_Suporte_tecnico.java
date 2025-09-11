
package Aula06_semCalculo;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex03_Suporte_tecnico {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("--------------------");
        System.out.println("1 - Problema de internet");
        System.out.println("2 - Problema de login");
        System.out.println("3 - Erro no sistema");
        System.out.println("4 - Solicitação de atualização");
        int op = teclado.nextInt();
        
        switch(op) {
            
            case 1:
                System.out.println("Problema de internet? por favor desligue e ligue o roteador");
                break;
            case 2:
                System.out.println("Problema de login? Por favor tente redefinir a senha ou ligue para o nosso suporte");
                break;
            case 3:
                System.out.println("Erro no sistema? Tente formatar o aparelho ou procure um tecnico");
                break;
            case 4:
                System.out.println("Solicitação de atualização? Vá para as configurções do sistema");
                break;
            default:
                System.out.println("Opção não reconhecida, tente novamente");
            
            
        }
        
        
        
        
        
        
    }
    
}
