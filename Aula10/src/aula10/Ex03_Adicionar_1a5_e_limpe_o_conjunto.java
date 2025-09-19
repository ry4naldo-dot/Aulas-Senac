
package aula10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex03_Adicionar_1a5_e_limpe_o_conjunto {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>();
        int num = 0;
        
        System.out.println("----------");
       
        for (int i = 1; i <= 5; i++) {
            
            System.out.println("Digite um número "+i+" : ");
            num = teclado.nextInt();
            numeros.add(num);
            
        }
        
        System.out.println("\nNúmeros adicionadas antes da limpeza:");
        
        for(int numero : numeros) {
            
            System.out.println(numero);
            
        }
        
       
        System.out.println("\n==== Limpando o conjunto ==== ");
       
        numeros.clear();
        
        System.out.println("Lista após limpeza: "+numeros);
        
    }
    
}
