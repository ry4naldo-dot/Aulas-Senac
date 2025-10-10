
package aula12;

import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class Ex07_Array_de_Inteiros_em_ordemCrescente {
    
    public static int[] ordenarArray(int[] numeros) {
        
       for (int i = 0; i < numeros.length - 1; i++) {
           
           for (int j = i + 1; j < numeros.length; j++) {
               
               if (numeros[i] > numeros[j]) {
                   
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                    
                }
            }
        }
        return numeros;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos números você quer ordenar? ");
        int qtd = teclado.nextInt();

        int[] numeros = new int[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        int[] ordenado = ordenarArray(numeros);
        
        System.out.print("Array ordenado: ");
        for (int num : ordenado) {
            System.out.print(num + " ");
            
        }
    }    
}
