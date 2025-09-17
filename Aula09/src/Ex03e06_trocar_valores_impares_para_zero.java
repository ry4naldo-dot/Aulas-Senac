
import java.util.Scanner;


/**
 *
 * @author Ryan
 */
public class Ex03e06_trocar_valores_impares_para_zero {
    
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
         
        System.out.println("Quantos números deseja digitar: "); 
        int quantidade = teclado.nextInt();
        
        int[] numeros = new int[quantidade];
        
        for (int i = 0; i < quantidade; i++) {
            
            System.out.println("Digite o número "+(i + 1)+" : ");
            numeros[i] = teclado.nextInt();
            
        }
        
        System.out.println("Antes: ");
        for (int num : numeros) {
            
            System.out.println(num);
            
        }
        
       
        for (int i = 0; i < numeros.length; i++) {
            
            if (numeros[i] % 2 != 0) {
                
                numeros[i] = 0;
                
            }
            
        }
        
        System.out.println("Depois: ");
            for (int num : numeros) {
                
                System.out.println(num);
                
            }
        
    }
    
}
