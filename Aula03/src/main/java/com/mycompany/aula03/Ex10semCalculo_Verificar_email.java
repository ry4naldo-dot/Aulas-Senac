
package com.mycompany.aula03;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex10semCalculo_Verificar_email {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu email: ");
        String email = teclado.nextLine();
      
        if (email.contains("@") && email.endsWith(".com")) {
            
            System.out.print("O email "+email+" é válido");
            
        } else {
            
            System.out.print("O email "+email+" não é válido");
            
        }
        
    } 
    
}