
package com.mycompany.aula03;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex02_semCalculo_Saudacao_personalizada {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.println("Em qual turno você estuda? ");
        String turno = teclado.nextLine();
        
        if (turno.equalsIgnoreCase("Manhã")) {
            
            System.out.println("O aluno "+nome+" estuda no turno da "+turno);
            
        } else if (turno.equalsIgnoreCase("Tarde")) {
            
            System.out.println("O aluno "+nome+" estuda no turno da "+turno);
            
        } else if (turno.equalsIgnoreCase("Noite")) {
            
            System.out.println("O aluno "+nome+" estuda no turno da "+turno);
           
        }
        
    }
    
}
