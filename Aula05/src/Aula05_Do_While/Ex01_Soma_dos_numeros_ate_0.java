
package Aula05_Do_While;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex01_Soma_dos_numeros_ate_0 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int soma = 0;
        
        int num;
        
        do {
            
            System.out.println("Digite um valor para soma(0 para sair): ");
            num = teclado.nextInt();
            soma += num;
            
        } while (num > 0);
        
        System.out.println("A soma de todos os números é: "+soma);
        
    }
    
}