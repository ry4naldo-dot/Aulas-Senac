
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Ryan
 */
public class Ex06_Avançado_Filtrar_palavras_especificas {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();

       
        System.out.print("Quantas palavras você quer digitar? ");
        int quantidade = teclado.nextInt();
        teclado.nextLine(); 

        for (int i = 0; i < quantidade; i++) {
            
            System.out.print("Digite a palavra " + (i + 1) + ": ");
            String palavra = teclado.nextLine();
            palavras.add(palavra);
            
        }

        
    
        System.out.print("Digite a letra inicial para filtrar: ");
        char letra = teclado.nextLine().toLowerCase().charAt(0);

        System.out.println("\nPalavras que começam com " + letra + ":");

        
        for (String palavra : palavras) {
            
            if (!palavra.isEmpty() && palavra.toLowerCase().charAt(0) == letra) {
                System.out.println(palavra);
                
            }    
        }
        
    }
    
}
