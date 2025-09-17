
import java.util.Scanner;


/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Exemplo01_Contador_de_Vogais {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite uma frase: ");
        String frase = teclado.nextLine().toLowerCase();
        
        int contadorVogais = 0;
        
        for (char letra : frase.toCharArray()) {
            
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            contadorVogais++;
            
            }
            
        }
        
        System.out.println("A frase contém "+contadorVogais+" vogais");
        
    }
    
}
