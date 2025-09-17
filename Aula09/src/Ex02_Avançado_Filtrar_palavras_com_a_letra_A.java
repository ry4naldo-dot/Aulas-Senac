
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex02_Avançado_Filtrar_palavras_com_a_letra_A {
    
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

        
    
       
        String letra = "a";

        System.out.println("\nPalavras que começam com " + letra + ":");

        
        for (String palavra : palavras) {
            
            if (palavra.contains(letra)) {
                
                System.out.println(palavra);
                
            }    
        }
        
    }
    
}
