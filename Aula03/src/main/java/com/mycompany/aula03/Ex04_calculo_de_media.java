
package com.mycompany.aula03;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex04_calculo_de_media {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a priemira nota: ");
        double nota1 = teclado.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = teclado.nextDouble();
        
        double med = (nota1 + nota2) / 2;
      
        if (med < 5) {
            
            System.out.print("REPROVADO!");
            
        } else if (med >= 5.0 && med <= 6.9) {
            
            System.out.print("RECUPERAÇÃO");
            
        } else if (med >= 7.0) {
            
            System.out.print("APROVADO!");
            
        }
        
    } 
    
}