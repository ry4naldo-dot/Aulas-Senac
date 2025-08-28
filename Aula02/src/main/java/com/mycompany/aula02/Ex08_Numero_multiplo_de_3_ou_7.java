
package com.mycompany.aula02;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex08_Numero_multiplo_de_3_ou_7 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int n = teclado.nextInt();
        
        if (n % 3 == 0 && n % 7 == 0) {
            
            System.out.print("O numero "+n+" é multiplo de 3 e 7");
            
        } else {
            
            System.out.print("O numero "+n+" não é multiplo de 3 e 7");
            
        }
       
    }
    
}
/*se (n % 3 = 0) e (n % 7 = 0) entao*/