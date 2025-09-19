
package aula10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex08_Itere_sobre_o_HashSet {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Set<String> animais = new HashSet<>();
        
        System.out.println("Digite 5 nomes de animais: ");
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Animal "+(i+1)+" :");
            String animal = teclado.nextLine();
            animais.add(animal);
            
        }
        
        System.out.println(animais);
        
        for (String animal : animais) {
            
            System.out.println(animal);
            
        }
        
    }
    
}
