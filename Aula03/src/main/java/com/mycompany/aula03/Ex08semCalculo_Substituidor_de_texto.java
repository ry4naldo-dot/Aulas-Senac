
package com.mycompany.aula03;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex08semCalculo_Substituidor_de_texto {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite uma frase/palavra: ");
        String frase = teclado.nextLine();
        
        if (frase.contains("java")) {
            
            String novafr = frase.replace("java", "programação");
            System.out.print(novafr);
            
        } else {
            
            System.out.print(frase);
            
        }
        
    }
    
}