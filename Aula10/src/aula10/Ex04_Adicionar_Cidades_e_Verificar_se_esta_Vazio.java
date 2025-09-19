
package aula10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex04_Adicionar_Cidades_e_Verificar_se_esta_Vazio {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Set<String> cidades = new HashSet<>();
        
        System.out.println("Quantas cidades você deseja adicionar? ");
        int qtd = teclado.nextInt();
        teclado.nextLine();
        
        
        for (int i = 1; i <= qtd; i++) {
            
            System.out.println("Digite o nome da cidade "+i+" : ");
            String cidade = teclado.nextLine();
            cidades.add(cidade);  
            
        }
        
        System.out.println("\nCidades antes da verificação: ");
        
        for(String cidade : cidades) {
            
            System.out.println(cidade);
            
        }
        
       
        System.out.println("\n---- Verificando conjunto ----");
        String nada = "";
        
        if(cidades.contains(nada)) {
            
            System.out.println("A lista está vazia ");
            System.out.println(cidades);
            
        } else {
            
            System.out.println("A lista não está vazia "+cidades);
            
        }
        
    }
    
}
