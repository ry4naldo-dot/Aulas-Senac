
import java.util.Scanner;


/**
 *
 * @author Ryan
 */
public class Ex01Intermediário_Elementos_maior_que_10 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        
        int quantidade = 5;
        int[] numeros = new int[quantidade];

        
        for (int i = 0; i < quantidade; i++) {
            
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        int contador = 0;

       
        for (int numero : numeros) {
            
            if (numero > 10) {
                
                contador++;
                
            }
        }

        System.out.println("Quantidade de números maiores que 10: " + contador);

        
    }
    
}
