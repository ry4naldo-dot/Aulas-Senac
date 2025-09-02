
package com.mycompany.aula03;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex09semCalculo_Contador_de_Palavra {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String frase = teclado.nextLine().trim();
        
        if (frase.isEmpty()) {
            
            System.out.print("A sua frase esta vazia");
            
        } else {
            
            String[]palavra = frase.split("\\s+");
            System.out.print("Número de palavras: "+palavra.length);
            
        }
        
    }
    
}
