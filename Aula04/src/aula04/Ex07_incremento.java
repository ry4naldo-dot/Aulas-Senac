
package aula04;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex07_incremento {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o numero inicial: ");
        int in = teclado.nextInt();
        
        System.out.print("Digite o ultimo numero: ");
        int ul = teclado.nextInt();
        
        System.out.print("Digite o incremento: ");
        int inc = teclado.nextInt();
        
        for (int i = in; i <= ul; i+=inc) {
            
            System.out.println(i);
            
        }
        
    }
    
}
/*Escreval ("Qual o número inicial: ")
Leia (numi)

Escreval ("Qual o ultimo número: ")
Leia (numf)

Escreval ("Qual o incremento: ")
Leia (inc)

Para c de numi até numf passo inc faca

Escreval (c)

Fimpara
*/
