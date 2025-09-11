
package Aula06_semCalculo;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex02_Assistente_virtual {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("====================");
        System.out.println("1 - Ver previsão do tempo");
        System.out.println("2 - Ver noticias");
        System.out.println("3 - Abrir agenda");
        System.out.println("4 - Ouvir música");
        int op = teclado.nextInt();
        System.out.println("====================");
        
        switch (op) {
            
            case 1:
                System.out.println("Hoje é sol com ventos fortes e amanhã é nublado");
                break;
            case 2:
                System.out.println("Noticias: Hoje jovem fica preso dentro de casa por burrice");
                break;
            case 3:    
                System.out.println("DOMINDO |x|,SEGUNDA |x|, TERÇA |x|, QUARTA |x|, QUINTA |x|, SEXTA | |, SABADO | |");
                break;
            case 4:
                System.out.println("Ouça as musicas do momento");
                break;
            default:
                System.out.println("Opção invalida");
                
        }
        
    }
    
}
