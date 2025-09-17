

import java.util.Scanner;


/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex04Facíl_Média_de_Notas_double {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
      
        int quantidadeNotas = 5;
        double[] notas = new double[quantidadeNotas];

      
        for (int i = 0; i < quantidadeNotas; i++) {
            
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = teclado.nextDouble();
            
        }

        double soma = 0;

       
        for (double nota : notas) {
            
            soma += nota;
            
        }

        double media = soma / quantidadeNotas;

        System.out.printf("A média das notas é: %.2f%n", media);


        
    }
    
}
