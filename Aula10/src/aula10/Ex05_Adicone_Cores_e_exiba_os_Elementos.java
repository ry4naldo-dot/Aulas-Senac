
package aula10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex05_Adicone_Cores_e_exiba_os_Elementos {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Set<String> cores = new HashSet<>();
        
        System.out.println("Digite quantas cores você quer adicionar: ");
        int qtd = teclado.nextInt();
        teclado.nextLine();
        
        for (int i = 0; i < qtd; i++) {
            
            System.out.println((i+1)+" ° cor: ");
            cores.add(teclado.nextLine());
            
        }
              
        ArrayList<String> lista = new ArrayList<>(cores);
        
        System.out.println("Lista das cores adicionas: ");
        
        System.out.println(lista);
        
    }
    
}
