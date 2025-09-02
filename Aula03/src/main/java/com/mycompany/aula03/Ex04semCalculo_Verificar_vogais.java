
package com.mycompany.aula03;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex04semCalculo_Verificar_vogais {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite uma palavra: ");
        String pal = teclado.nextLine();
        
        if (pal.contains("a") || pal.contains("e") || pal.contains("i") || pal.contains("o") || pal.contains("u")) {
            
            System.out.print("A palavra "+pal+" tem uma ou mais vogais");
            
        } else {
            
            System.out.print("A palavra "+pal+" não tem vogal");
            
        }
        
    }
    
}