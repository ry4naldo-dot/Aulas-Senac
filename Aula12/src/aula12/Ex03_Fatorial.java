
package aula12;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex03_Fatorial {
    
    public static int fat(int n){
        
        int fatorial = 1;
        int cont = 1;
        
        if (n >= 0) {
            
            while (cont <= n) {
                
                fatorial = fatorial * cont;
                cont += 1;
                
            }
            
            System.out.print("O fatorial de "+n+" é "+fatorial);
            
        } else {
            
            System.out.println("Número inválido, digite um valor positivo.");
            
        }
        return fatorial;
        
    }
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um número para o fatorial: ");
        int n = teclado.nextInt();
        
        int resultado = fat(n);
        
        System.out.println(resultado);
        
    }
    
}
