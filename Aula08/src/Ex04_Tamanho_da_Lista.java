
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex04_Tamanho_da_Lista {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<Character> letras = new ArrayList<>();
        
        System.out.println("Digite quatro letras: ");
        
        for (int i = 0; i < 4; i++) {
            
            System.out.print("Letra "+(i+1)+" : ");
            char letra = teclado.next().charAt(0);
            letras.add(letra);
            
        }
        
        letras.size();
        System.out.println("O tamanho da lista é de: "+letras.size());
        
    }
    
}