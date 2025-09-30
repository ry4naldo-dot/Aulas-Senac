
package aula12;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex01_Somar_Dois_Numeros {
    
    public static int soma(int n1, int n2){
        
        return n1 + n2;
        
    }
    
   public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o valor de n1: ");
        int n1 = teclado.nextInt();
        
        System.out.println("Digite o valor de n2: ");
        int n2 = teclado.nextInt();
        
        int resultado = soma(n1,n2);
        
        System.out.println("A soma dos números selecionados é: "+resultado);
        
    }
    
}
