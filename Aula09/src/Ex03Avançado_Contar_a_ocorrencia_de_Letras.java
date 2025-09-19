import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex03Avançado_Contar_a_ocorrencia_de_Letras {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Set<Character> letras = new HashSet<>();
        
        System.out.print("Digite uma palavra ou frase: ");
        String texto = teclado.nextLine().toLowerCase(); 
        
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (Character.isLetter(letra)) {
                letras.add(letra);
            }
        }
        
        
        System.out.println("Ocorrências de cada letra:");
        for (char letra : letras) {
            int contagem = 0;
            for (int i = 0; i < texto.length(); i++) {
                if (texto.charAt(i) == letra) {
                    contagem++;
                }
            }
            System.out.println(letra + ": " + contagem);
        }
        
    }
    
}
