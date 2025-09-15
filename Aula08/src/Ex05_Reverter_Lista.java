
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
            
            invertida = new StringBuilder(pal).reverse().toString();
            
            palavras.add(invertida);
            
        }
        
        if (pal != invertida) {
            
            System.out.println("A palavra que você digitou invertida é "+palavras);
            
        } 
        
    }
    
}
