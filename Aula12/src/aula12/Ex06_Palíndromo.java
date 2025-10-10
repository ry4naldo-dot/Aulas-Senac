
package aula12;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex06_Palíndromo {
    
    public static boolean palindromo(String pal){
        
        String invertida = new StringBuilder(pal).reverse().toString();

        return pal.equals(invertida);
    }
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite uma palavra: ");
        String pal = teclado.nextLine();
        
        boolean res = palindromo(pal);
        
        System.out.println("Palavra digitada"+pal+" "+res);
        
    }
    
}
