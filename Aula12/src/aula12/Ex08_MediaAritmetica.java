
package aula12;

import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class Ex08_MediaAritmetica {
    
    public static double calcularMedia(int[] numeros) {
        
        if (numeros.length == 0) return 0;
        
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        
        return (double) soma / numeros.length;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos números você quer calcular a média? ");
        int qtd = teclado.nextInt();

        int[] numeros = new int[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        double media = calcularMedia(numeros);
        System.out.println("Média aritmética: " + media);

     
    }

    
}
