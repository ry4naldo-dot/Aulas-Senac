
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
        
        int[] quantidade = new int [qtd];
        
        for (int i: quantidade) {
            
            System.out.println("Digite "+(i+1)+" : ");
            String elemento = teclado.nextLine();
            elementos.add(elemento);  
            
        }
        
        System.out.println("Os elementos são: "+elementos);
        
    }
    
}
