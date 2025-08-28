
package com.mycompany.aula02;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex09_verificar_aluno_aprovado {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a sua nota: ");
        double nota = teclado.nextDouble();
        
        System.out.print("Digite a sua frequência nas aulas: ");
        double fre = teclado.nextDouble();
        
        if (nota >= 60 && fre >= 75) {
            
            System.out.print("Aprovado");
            
        } else {
            
            System.out.print("REPROVADO!");
           
        }
        
    }
    
}
