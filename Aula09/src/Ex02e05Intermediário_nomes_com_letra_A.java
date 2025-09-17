
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Ryan
 */
public class Ex02e05Intermediário_nomes_com_letra_A {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

       
        System.out.print("Quantas nomes você quer digitar? ");
        int quantidade = teclado.nextInt();
        teclado.nextLine(); 

        for (int i = 0; i < quantidade; i++) {
            
            System.out.print("Digite a palavra " + (i + 1) + ": ");
            String nome = teclado.nextLine().toLowerCase();
            nomes.add(nome);
            
        }

        
    
       
        String letra = "a";

        System.out.println("\nNomes que começam com " + letra + ":");

        
        for (String nome : nomes) {
            
            if (nome.startsWith(letra)) {
                
                System.out.println(nome);
                
            }    
        }
        
    }
    
}
