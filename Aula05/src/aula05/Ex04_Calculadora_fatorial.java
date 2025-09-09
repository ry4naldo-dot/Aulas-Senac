
package aula05;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex04_Calculadora_fatorial {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int fat = 1;
        int cont = 1;
        
        System.out.print("Digite um número para o calculo fatorial: ");
        int num = teclado.nextInt();
        
        if (num >= 0) {
            
            while (cont <= num) {
                
                fat = fat * cont;
                cont += 1;
                
            }
            
            System.out.print("O fatorial de "+num+" é "+fat);
            
        } else {
            
            System.out.println("Número inválido, digite um valor positivo.");
            
        }
        
    }
    
}