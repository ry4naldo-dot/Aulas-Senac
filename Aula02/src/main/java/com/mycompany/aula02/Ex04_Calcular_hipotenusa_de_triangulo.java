
package com.mycompany.aula02;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex04_Calcular_hipotenusa_de_triangulo {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o c1: ");
        double c1 = teclado.nextDouble();
        
        System.out.print("Digite o c2: ");
        double c2 = teclado.nextDouble();
        
        double hipotenusa = Math.pow(c1, 2) + Math.pow(c2, 2);
        
        double res = Math.sqrt(hipotenusa);
      
        System.out.printf("O resultado da hipotenusa é: %.2f%n",res);
       
    }
    
}
/*Utiliza funções aritmeticas da classe Math para calcular a hipotenusa
(hipotenusa² = cateto² + cateto²)
tire a raiz quadrada no final*/