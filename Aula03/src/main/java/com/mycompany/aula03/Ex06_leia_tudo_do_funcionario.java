
package com.mycompany.aula03;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex06_leia_tudo_do_funcionario {
 
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        
        
        System.out.print("Digite seu sálario: ");
        double sal = teclado.nextDouble();
        
        System.out.print("Digite quantos anos você esta na empresa: ");
        int ano = teclado.nextInt();
        
        if (ano <= 3) {
            
            double aumento = sal + (sal * 0.03);
            System.out.print("Parabens "+nome+" você recebeu um aumento de R$"+aumento);
            
        } else if (ano > 3 && ano < 10) {
            
            double aumento = sal + (sal * 0.125);
            System.out.print("Parabens "+nome+" você recebeu um aumento de R$"+aumento);
            
        } else if (ano >= 10) {
            
            double aumento = sal + (sal * 0.20);
            System.out.print("Parabens "+nome+" você recebeu um aumento de R$"+aumento);
            
        }
        
    }
    
}