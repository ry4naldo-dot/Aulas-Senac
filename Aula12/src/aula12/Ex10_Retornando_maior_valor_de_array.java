
package aula12;

import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class Ex10_Retornando_maior_valor_de_array {
    
    public static int maiorValor(int[] numeros) {
        
        int maior = numeros[0];
        
        for (int num : numeros) {
            
            if (num > maior) {
                
                maior = num;
                
            }
        }
        
        return maior;
        
    }

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos números você quer analisar? ");
        int tamanho = teclado.nextInt();

        int[] numeros = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
            
        }

        int maior = maiorValor(numeros);
        System.out.println("Maior valor: " + maior);

    }

    
}
