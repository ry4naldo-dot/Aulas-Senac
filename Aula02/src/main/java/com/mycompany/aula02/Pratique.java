
package com.mycompany.aula02;

import java.util.Scanner;

public class Pratique {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int n1 = teclado.nextInt();
        
        System.out.println("Digite outro numero: ");
        int n2 = teclado.nextInt();
        
        int soma = n1 + n2;
        int sub = n1 - n2;
        int mult = n1 * n2;
        double div = n1 / n2;
        int absol1 = Math.abs(-n1);
        int absol2 = Math.abs(-n2);
        double raiz1 = Math.sqrt(n1);
        double raiz2 = Math.sqrt(n2);
        
        System.out.println("----Resultado----");
       
        System.out.println("Soma: "+soma);
        System.out.println("Subtração: "+sub);
        System.out.println("Multiplicação: "+mult);
        System.out.println("Divisão: "+div);
        System.out.println("Primeiro Absoluto: "+absol1);
        System.out.println("Segundo absoluto: "+absol2);
        System.out.println("Primeira Raiz quadrada: "+raiz1);
        System.out.println("Segunda Raiz quadrada: "+raiz2);
        
    }
  
}
/*crie um programa que solicite ao usuario uma informacao, utilize parenteses, 
operadores, funcoes aritmeticas, leitura de dados e variaveis com tipos primitivos*/