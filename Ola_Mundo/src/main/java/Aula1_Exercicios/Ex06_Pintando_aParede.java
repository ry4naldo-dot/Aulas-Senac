
package Aula1_Exercicios;

import java.util.Scanner;


public class Ex06_Pintando_aParede {
   
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual a altura da sua parede? ");
        double alt = teclado.nextDouble();
        
        System.out.print("Qual a largura da parede? ");
        double larp = teclado.nextDouble();
        
        double area = larp * alt;
        
        double tin = area / 2;
        
        System.out.print("Serão necessarios "+tin+" litros de tinta para pintar sua parede");
        
    }
    
}
/* Sua mãe decidiu pintar uma parede do seu quarto e precisa calcular a quantidade de tinta necessária.
Sabendo que cada litro de tinta pinta 2 metros quadrados,
crie um programa que pergunte a altura e largura da parede, calcule a área e exiba quantos litros de tinta serão necessários.
1 Litro = 2 metros
*/