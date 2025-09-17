
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex02Fácil_Exibir_em_letras_maiúsculas {
    
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
    
    ArrayList<String> letras = new ArrayList<>();
    
        System.out.println("Digite a quantidade de letras que você deseja: ");
        int quantidade = teclado.nextInt();
        teclado.nextLine();
        
        int[] numeros = new int [quantidade];
        
        for (int i : numeros) {
            
            System.out.println("Digite a letra "+(i + 1)+" : ");
            String letra = teclado.nextLine().toUpperCase();
            letras.add(letra);
            
        }
        
        System.out.println(letras);
                       
   } 
    
}
