
package aula10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex06_Removando_a_cidade_de_SP {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Set<String> cidades = new HashSet<>();
        
        System.out.println("Quantas cidades você deseja adicionar? ");
        int qtd = teclado.nextInt();
        teclado.nextLine();
        
        
        for (int i = 1; i <= qtd; i++) {
            
            System.out.println("Digite o nome da cidade "+i+" : ");
            String cidade = teclado.nextLine().toLowerCase();
            cidades.add(cidade);  
            
        }
        
        System.out.println("\nCidades antes da remoçãp de São Paulo: ");
        
        for(String cidade : cidades) {
            
            System.out.println(cidade);
            
        }
        
       
        System.out.println("\n---- Verificando conjunto ----");
        
        if(cidades.contains("são paulo")) {
            
            System.out.println("SP removida");
            cidades.remove("são paulo");
            System.out.println(cidades);
            
        } else {
            
            System.out.println("A lista não tem sp "+cidades);
            
        }
        
    }
    
}
