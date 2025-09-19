
package aula10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex07_Exiba_o_tamanho_do_HashSet {
        
    public static void main(String[] args) {
        
        //abcdefghijklmnopqrstuvwxyz
    
    Scanner teclado = new Scanner(System.in);
    Set<Character> alfabeto = new HashSet<>();
    
     System.out.println("Digite o alfabeto: ");
        
        for (int i = 0; i < 26; i++) {
            
            System.out.print("Letra "+(i+1)+" : ");
            char letra = teclado.next().charAt(0);
            alfabeto.add(letra);
            
        }
        
        alfabeto.size();
        System.out.println("O tamanho da lista é: "+alfabeto.size());
        
    }
    
}
