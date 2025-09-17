
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex01Avançado_filtros_para_inteiros {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

       
        System.out.print("Quantas números você quer digitar? ");
        int quantidade = teclado.nextInt();
        int[] contador = new int [quantidade];
        int cont = 0;

        for (int i : contador) {
            
            cont++;
            System.out.print("Digite o número "+cont+" : ");
            int numero = teclado.nextInt();
            numeros.add(numero);
            
        }

        numeros.removeIf(n -> n % 2 == 1);
     
        System.out.println(numeros);
                
                
        
        
    }
    
}
