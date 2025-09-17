
import java.util.Scanner;



/**
 *
 * @author Ryan
 */
public class Ex08_Intermediário_Contar_quantos_são_pares {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
         
        System.out.println("Quantos numeros você deseja digitar: ");
        int quantidade = teclado.nextInt();
        int[] numeros = new int[quantidade];
        
        for (int i = 0; i < quantidade; i++) {
            
            System.out.println("Numero "+(i + 1)+" : ");
            numeros[i] = teclado.nextInt();
            
            
        }
        
        int pares = 0;
        
        for (int num : numeros) {
            
            if (num % 2 == 0) {
                
                pares++;
                
            }
            
        }
        
        System.out.println("A lista possui "+pares+" números pares");
        
    }
    
}
