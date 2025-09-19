
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex05Fácil_Exibir_Elementos_de_HashSet {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Set<String> elementos = new HashSet<>();
        
        System.out.println("Quantas elementos você deseja adicionar? ");
        int qtd = teclado.nextInt();
        teclado.nextLine();
        
        
        for (int i = 1; i <= qtd; i++) {
            
            System.out.println("Digite "+i+" : ");
            String elemento = teclado.nextLine();
            elementos.add(elemento);  
            
        }
        
        System.out.println("Os elementos são: "+elementos);
        
    }
    
}
