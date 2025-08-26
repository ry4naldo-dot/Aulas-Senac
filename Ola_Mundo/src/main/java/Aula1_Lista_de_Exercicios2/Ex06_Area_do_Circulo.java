
package Aula1_Lista_de_Exercicios2;

import java.util.Scanner;


public class Ex06_Area_do_Circulo {
   
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um numero para o raio: ");
        double raio = teclado.nextDouble();
        
        double A = 3.14 * (raio * raio);
        
        System.out.printf("A Área é: %.2f%n",A);
       
    }
    
}
/*6) Área do círculo: Leia o raio e mostre a área do círculo (A = πr2).*/