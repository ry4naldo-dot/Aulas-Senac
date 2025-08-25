
package Aula1_Exercicios;

import java.util.Scanner;


public class Ex10_Salário_do_Cupincha {
  
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Quantos dias você trabalhou? ");
        int dias = teclado.nextInt();
        
        int pordia = 25 * 8;
                
        System.out.print("Seu novo salario eh de: "+(dias * pordia));
        
    }
   
}
/*O Cupincha, mascote do nosso time, precisa calcular seu novo salário! 
Ele ganha R$ 25 por hora e trabalha 8 horas por dia. Crie um programa que pergunte quantos dias ele trabalhou e calcule seu novo salário
200 por dia
.*/