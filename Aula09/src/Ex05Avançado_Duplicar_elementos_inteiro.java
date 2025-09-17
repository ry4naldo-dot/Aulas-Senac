
import java.util.Arrays;
import java.util.Scanner;



/**
 *
 * @author Ryan
 */
public class Ex05Avançado_Duplicar_elementos_inteiro {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
    
        System.out.print("Quantos números você quer digitar? ");
        int quantidade = teclado.nextInt();
        int[] numeros = new int[quantidade];
        
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        
        int[] duplicados = new int[quantidade];
        int dup = 0;
        for (int num : numeros) {
            duplicados[dup] = num * 2;
            dup++;
        }

       
        System.out.println("Números duplicados: " + Arrays.toString(duplicados));

        
    }
    
}
