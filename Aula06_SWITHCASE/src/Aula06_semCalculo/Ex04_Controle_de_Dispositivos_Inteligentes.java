
package Aula06_semCalculo;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex04_Controle_de_Dispositivos_Inteligentes {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("1 - Acender luzes");
        System.out.println("2 - Apagar luzes");
        System.out.println("3 - Ligar TV");
        System.out.println("4 - Desligar TV");
        System.out.println("5 - Abrir portão");
        System.out.println("6 - Fechar portão");
        int op = teclado.nextInt();
              
        switch (op) {
            
            case 1:
                System.out.println("---- acendendo as luzes ----");
                break;
            case 2:    
                System.out.println("---- desligando as luzes ----");
                break;
            case 3:    
                System.out.println("---- ligando a TV ----");
                break;
            case 4:
                System.out.println("---- desligando a TV ----");
                break;
            case 5:
                System.out.println("---- abrindo portão ----");
                break;
            case 6:
                System.out.println("---- fechando portão ----");
                break;
            default:    
                System.out.println("Comando inválido");     
                
        }
              
    }
    
}
