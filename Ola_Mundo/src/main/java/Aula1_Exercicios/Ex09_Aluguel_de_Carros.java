
package Aula1_Exercicios;

import java.util.Scanner;


public class Ex09_Aluguel_de_Carros {
  
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Quantos quilometros foram percorridos? ");
        double km = teclado.nextDouble();
        
        System.out.print("Quantos dias o carro foi alugado? ");
        double dia = teclado.nextDouble();
        
        double valor = km * 0.20;
        
        double dias = dia + 90;
        
        System.out.print("O total foi: "+(valor + dias)+"R$");
       
    }
    
}
/* Uma locadora de carros cobra R$ 90 por dia de aluguel e R$ 0,20 por quilômetro rodado. 
Crie um programa que pergunte quantos quilômetros foram percorridos e por quantos dias o carro foi alugado. 
Calcule o preço total do aluguel e exiba o resultado na tela.
*/