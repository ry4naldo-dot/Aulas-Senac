
package com.mycompany.aula02;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex03_verificar_se_pode_dirigir {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();
        
        if (idade >= 18) {
            
            System.out.print("Parabens, você já pode tirar a sua CNH");
            
           
            
        } else {
            
            System.out.print("Você não pode tirar a CNH");
            
        }
        
    }
    
}
/*a pessoa deve ter 18 anos ou mais e possuir carteira de motorista(CNH)*/