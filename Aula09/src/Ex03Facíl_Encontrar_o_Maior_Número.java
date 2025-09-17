
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Ryan
 */
public class Ex03Facíl_Encontrar_o_Maior_Número {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.print("Quantas números você quer digitar? ");
        int quantidade = teclado.nextInt();
        int[] numeros = new int [quantidade];
        

        for (int i = 0; i < quantidade; i++) {
            
      
            System.out.print("Digite o número "+(i+1)+" : ");
            numeros[i] = teclado.nextInt();
             
        }
        
        int maior = numeros[0];
        
        for (int numero : numeros) {
            
            if (numero > maior) {
                
                maior = numero;
                
            }
            
        }
        
        System.out.println("O maior número encontrado é: "+maior);
        
    }
    
}
