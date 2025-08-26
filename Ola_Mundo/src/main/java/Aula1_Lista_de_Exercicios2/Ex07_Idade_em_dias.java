
package Aula1_Lista_de_Exercicios2;

import java.util.Scanner;


public class Ex07_Idade_em_dias {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite quantos anos você tem: ");
        int ano = teclado.nextInt();
        
        double dias = 365 * ano;
                
          System.out.printf("Aqui esta sua idade em dias: %.2f%n", dias);    
       
    }
    
}
/*7) Idade em dias: Leia sua idade em anos e mostre a idade aproximada em dias (365 dias/ano).*/