
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author RYANGABRIELDAROSA
 */
public class VbetaEx03Avançado_Contar_Ocorrencia_de_cada_letra {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        ArrayList<Character> letras = new ArrayList<>();
        
        System.out.println("Digite uma palavra: ");
        String pal = teclado.nextLine().toLowerCase();
        
        int contador = 0;
        
        for (char letra : pal.toCharArray()) {
            
            if (letra == 'a' || letra == 'b' || letra == 'c' || letra == 'd' || letra == 'e' || letra == 'f' || letra == 'g' || letra == 'h' || letra == 'i' || letra == 'j' || letra == 'k' || letra == 'l' || letra == 'm' || letra == 'n' || letra == 'o' || letra == 'p' || letra == 'q' || letra == 'r' || letra == 's' || letra == 't' || letra == 'u' || letra == 'v' || letra == 'w' || letra == 'x' || letra == 'y' || letra == 'z') {
            contador++;
            letras.add(letra);
            
            }
            
        }
        
        System.out.println("A frase contém "+contador+" letras");
        System.out.println(letras);
        
    }
    
}
