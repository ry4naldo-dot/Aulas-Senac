
package aula12;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex02_Verificando_se_e_Par_ou_Impar {
    
    public static boolean verificarParouImpar(int n){
        
        if(n % 2 == 0){
            
            System.out.println("O número digitado é Par");
            return true;
            
        }else{
            
            System.out.println("O número digitado é Impar");
            
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int n = teclado.nextInt();
        
        boolean resultado = verificarParouImpar(n);
        
        System.out.println(resultado);
        
    }
    
}
