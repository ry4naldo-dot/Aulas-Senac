
package aula10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex01_1a10_Verifique_Se_o_5_esta_presente {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>();
        
        System.out.println("----------");
       
        for (int i = 1; i <= 10; i++) {
            
            System.out.println("Digite um número "+i+" : ");
            int num = teclado.nextInt();
            numeros.add(num);
            
        }
        
        System.out.println("Números adicionadas: ");
        
        for(int numero : numeros) {
            
            System.out.println(numero);
            
        }
        
       
        System.out.println("\nVerificando se o número 5 está na lista: ");
        int busca = 5;
        
        if(numeros.contains(busca)) {
            
            System.out.println(busca+" encontrada");
            
        } else {
            
            System.out.println(busca+" não está na lista");
            
        }
        
    }
    
}
