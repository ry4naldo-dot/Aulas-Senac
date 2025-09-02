
package com.mycompany.aula03;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex03semCalculo_Inversor_Palavra {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite uma palavra: ");
        String pal = teclado.nextLine();
        
        String invertida = new StringBuilder(pal).reverse().toString();
        
        if (pal != invertida) {
            
            System.out.println("A palavra que você digitou invertida é "+invertida);
            
        } 
        
    }
    
}