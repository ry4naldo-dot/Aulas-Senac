
package aula05;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex01_media_de_idade {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int cont = 1;
        int idade = 0;
        int soma = 0;
        int quan = 0;
        double med = 0;
        
        System.out.print("Digite a quantidade de alunos: ");
        quan = teclado.nextInt();
        
        while (quan >= cont) {
            
            System.out.print("Digite a proxima idade do "+cont+"° aluno:");
            idade = teclado.nextInt();
            
            soma += idade;
            cont++;
            
        }
        
        if (cont > 0) {
            
            med = soma / cont;
            
            System.out.printf("A media de idade da turma é: %.2f%n", med);
            
        } else {
            
            System.out.println("Nenhuma idade foi informada.");
            
        }
        
    }
    
}