
package com.mycompany.aula03;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex05_semCalculoClassificador_de_login {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe o login: ");
        String log = teclado.nextLine();
        
        if (log.length() >= 6 && !log.contains(" ")) {
        
            System.out.print("Válido");
        
        } else {
            
            System.out.print("Inválido");
            
        }
            
    }
    
}