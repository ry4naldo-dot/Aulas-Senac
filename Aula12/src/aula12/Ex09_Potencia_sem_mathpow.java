
package aula12;

import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class Ex09_Potencia_sem_mathpow {
    
        public static int potencia(int base, int expoente) {
        int resultado = 1;
        
        for (int i = 0; i < expoente; i++) {
            
            resultado *= base;
            
        }
        
        return resultado;
    }

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = teclado.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = teclado.nextInt();

        int resultado = potencia(base, expoente);
        System.out.println(base + " elevado a " + expoente + " é: " + resultado);

    }

    
}
