
package aula04;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex05_calcular_media_de_5_num {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int soma = 0;
        int med = 0;       
        
        for (int i = 1; i <= 5; i++) {
            
            System.out.print("Digite um número: ");
            int n = teclado.nextInt();
            
            soma = soma + n;
            
        }
        
        med = soma / 5;
        System.out.print("A media entre os 5 numeros são: "+med);
        
    }
    
}