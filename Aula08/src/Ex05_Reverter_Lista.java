
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex05_Reverter_Lista {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<String> palavras = new ArrayList<>();
        
        System.out.println("Digite seis palavras: ");
        
        String pal = null;
        String invertida = null;
        
        for (int i = 0; i < 6; i++) {
            
            System.out.println("Palavra "+(i+1)+" : ");
            pal = teclado.nextLine();
            palavras.add(pal);
            
        }
        
        System.out.println("Ordem digitada: \n"+palavras);
        
        int tam = palavras.size();
        
        for (int i = 0; i < tam / 2; i++) {
            
            String inv = palavras.get(i);
            
            palavras.set(i, palavras.get(tam - 1 - i));
            palavras.set(tam-1-i, inv);
            
        }
        
        System.out.println("Ordem invertida: \n"+palavras);
        
    }
    
}
