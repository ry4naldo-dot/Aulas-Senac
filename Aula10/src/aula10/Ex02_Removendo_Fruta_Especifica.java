
package aula10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex02_Removendo_Fruta_Especifica {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Set<String> frutas = new HashSet<>();
        
        System.out.println("Quantas frutas você deseja adicionar? ");
        int qtd = teclado.nextInt();
        teclado.nextLine();
        
        
        for (int i = 1; i <= qtd; i++) {
            
            System.out.println("Digite o nome da fruta "+i+" : ");
            String fruta = teclado.nextLine();
            frutas.add(fruta);  
            
        }
        
        System.out.println("\nFrutas antes da remoção: ");
        
        for(String fruta : frutas) {
            
            System.out.println(fruta);
            
        }
        
       
        System.out.println("\nDigite uma fruta para remove-la : ");
        String remover = teclado.nextLine();
        
        if(frutas.contains(remover)) {
            
            frutas.remove(remover);
            System.out.println(remover+" removido");
            System.out.println(frutas);
            
        } else {
            
            System.out.println(remover+" não está na lista");
            
        }
        
    }
    
}
