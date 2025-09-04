
package aula04;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex01_tabuada_completa {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = teclado.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            
            System.out.println(num+" x "+i+" = "+(num*i));
            
        }
        
        
    }
    
}