
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex01_Adicionar_e_Imprimir {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<String> cidades = new ArrayList<>();
        
         System.out.println("Digite 5 nomes de cidades: ");
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Cidade "+(i+1)+" :");
            String cidade = teclado.nextLine();
            cidades.add(cidade);
            
        }
        
        System.out.println("Lista de cidades: "+cidades);
        
    }
    
}
