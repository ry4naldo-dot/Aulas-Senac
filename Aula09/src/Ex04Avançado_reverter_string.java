
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author Ryan
 */
public class Ex04Avançado_reverter_string {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        ArrayList<Character> palavras = new ArrayList<>();
        
        System.out.println("Digite uma palavra: ");;
        String pal = teclado.nextLine();

        for (char palavra : pal.toCharArray()) {
            palavras.add(palavra);
        }

        String inv = " ";
        for (Character palavra : palavras) {
            inv = palavra + inv;
        }

        System.out.println("Palavra invertida: " + inv);

        
    }
    
}
