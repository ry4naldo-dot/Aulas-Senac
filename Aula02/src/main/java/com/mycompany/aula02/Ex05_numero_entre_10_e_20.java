
package com.mycompany.aula02;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex05_numero_entre_10_e_20 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um numero de 10 a 20: ");
        int n = teclado.nextInt();
        
        if (n >= 10 && n <= 20) {
        
          System.out.print("O numero "+n+" esta entre 10 e 20");
          
        
    } else {
            
            System.out.print("O numero "+n+" não esta entre 10 e 20"); 
            
            }
        
    }
    
}
