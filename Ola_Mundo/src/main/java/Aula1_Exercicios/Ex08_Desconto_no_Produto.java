
package Aula1_Exercicios;

import java.util.Scanner;


public class Ex08_Desconto_no_Produto {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Qual o valor do produto? ");
        double val = teclado.nextDouble();
        
        double des = val * 0.05;
        
        System.out.printf("Seu desconto é de: %.2f%n", des);
        
    }
   
}
/*  Uma loja está oferecendo 5% de desconto em todos os seus produtos. 5% = 0.5
Crie um programa que pergunte o valor de um produto e calcule o novo valor com o desconto aplicado. Exiba o resultado formatado com duas casas decimais.*/