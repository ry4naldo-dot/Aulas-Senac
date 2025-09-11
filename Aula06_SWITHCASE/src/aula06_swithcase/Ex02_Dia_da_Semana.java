
package aula06_swithcase;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex02_Dia_da_Semana {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("    ================");
        System.out.println("Selecione o dia da semana: ");
        System.out.println("    ================");
        
        System.out.println("      [1]");
        System.out.println("      [2]");
        System.out.println("      [3]");
        System.out.println("      [4]");
        System.out.println("      [5]");
        System.out.println("      [6]");
        System.out.println("      [7]");
        int dia = teclado.nextInt();
        
        switch (dia) {
            
            case 1:
                System.out.println("Hoje é Domingo!");
                break;
            case 2:
                System.out.println("Hoje é segunda");
                break;
            case 3:
                System.out.println("Hoje é terça");
                break;
            case 4:
                System.out.println("Hoje é quarta");
                break;
            case 5:
                System.out.println("Hoje é quinta");
                break;
            case 6:
                System.out.println("Hoje é SEXTA!");
                break;
            case 7:
                System.out.println("Hoje é Sabado!");
                break;
            default:
                System.out.println("Opção invalida");
                
        }
        
    }
    
}
