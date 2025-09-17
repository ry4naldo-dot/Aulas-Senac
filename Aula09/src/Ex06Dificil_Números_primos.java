
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex06Dificil_Números_primos {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> primos = new ArrayList<>();
        
        System.out.print("Quantas números você quer digitar? ");
        int quantidade = teclado.nextInt();
        
        int[] numeros = new int [quantidade];
        
        int numero = 0;
        
        
        for (int i = 0; i < quantidade; i++) {
            
            System.out.print("Digite o número "+(i+1)+" : ");
            numeros[i] = teclado.nextInt();
                  
        }
        
        for (int num : numeros) {
            
            if (num < 2) continue;
            
            boolean primo = true;   
            
            if (num == 2) {
                
                primos.add(num);
                
                continue;
                
            }
            
            if (num % 2 == 0) {
                
                continue;
                
            }
         
               for (int i = 3; i <= Math.sqrt(numero); i+=2) {
            
                if (numero % 1 == 0) {
                
                primo = false;
                break;
            }
                
            }
               
            if (primo) {
            
            primos.add(num);
               
        }
          
        }

        System.out.println(primos);
        
     }   
        
       
        
    }
//for (int i = 2; i <= Math.sqrt(num); i++)
//if(num % i == 0)