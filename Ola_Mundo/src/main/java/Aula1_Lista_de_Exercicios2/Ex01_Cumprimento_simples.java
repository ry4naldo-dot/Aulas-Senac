
package Aula1_Lista_de_Exercicios2;

import java.util.Scanner;


public class Ex01_Cumprimento_simples {
  
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("========== Cumprimento Simples ==========");
        
        String nome = teclado.nextLine();
        
        System.out.print("Ola "+nome+" Bem-Vindo(a) ao Java");
        
    }
   
}
/*1) Cumprimento simples: Leia seu nome completo e imprima 'Olá, ! Bem-vindo(a) ao Java.'*/