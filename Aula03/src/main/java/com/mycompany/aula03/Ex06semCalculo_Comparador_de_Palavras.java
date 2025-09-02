
package com.mycompany.aula03;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex06semCalculo_Comparador_de_Palavras {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a primeira palavra: ");
        String pal1 = teclado.nextLine();
        
        System.out.print("Digite a segunda palavra: ");
        String pal2 = teclado.nextLine();
        
        if (pal1.equalsIgnoreCase(pal2)) {
            
            System.out.print("As palavras são iguais");
            
        } else {
            
            System.out.print("As palavras são diferentes");
            
        }
        
    }
    
}