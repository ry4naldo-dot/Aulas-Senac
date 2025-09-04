
package aula04;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex08_Calculo_de_Idade {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int soma = 0;
        double med = 0;        
        
          for (int i = 1; i <= 5; i++) {
            
              System.out.print("Digite a idade: ");
              int idade = teclado.nextInt();
              
              soma = soma + idade;
              med = soma / 5;
              
        }
      
          System.out.println("A media das 5 idades é "+med);
        
    }
    
}