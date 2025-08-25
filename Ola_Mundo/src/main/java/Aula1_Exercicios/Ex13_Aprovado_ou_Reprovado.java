
package Aula1_Exercicios;

import java.util.Scanner;


public class Ex13_Aprovado_ou_Reprovado {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.print("Digite a 1° nota: ");
        double n1 = teclado.nextDouble();
        
        System.out.print("Digite a 2° nota: ");
        double n2 = teclado.nextDouble();
        
        double soma = n1 + n2;
        double med = soma / 2;
       
        if (med >= 7) {
            
            System.out.print(nome+" Você foi Aprovado");
            
        } else {
            
            System.out.print(nome+" Você foi Reprovado!");
            
        }
       
    }
   
}
/*Escreva um programa que pergunte o nome de um aluno e suas duas notas. 
Calcule a média e exiba uma mensagem informando se o aluno foi aprovado (média 7 ou superior).
*/