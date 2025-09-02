
package com.mycompany.aula03;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex01semCalculo_verificar_nome {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        
        if (nome.length() > 5) {
            
            System.out.println("Seu nome tem mais do que 5 caracteres");
            
        } else {
            
            System.out.println("Seu nome não tem mais do que 5 caracteres");
            
        }
        
    }
    
} 
