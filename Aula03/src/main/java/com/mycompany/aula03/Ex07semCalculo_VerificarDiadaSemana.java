
package com.mycompany.aula03;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex07semCalculo_VerificarDiadaSemana {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um dia da semana: ");
        String dia = teclado.nextLine();
        
        if (dia.equals("sabado") || dia.equals("domingo")) {
            
            System.out.print(dia+" É fim de semana");
            
        } else if (dia.equals("segunda") || dia.equals("terça") || dia.equals("quarta") || dia.equals("quinta") || dia.equals("sexta")) {
            
            System.out.print(dia+" É um dia útil");
            
        }
        
    }
    
}