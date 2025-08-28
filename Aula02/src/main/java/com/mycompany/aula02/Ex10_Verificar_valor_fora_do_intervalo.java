
package com.mycompany.aula02;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex10_Verificar_valor_fora_do_intervalo {
   
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
              
        System.out.print("Digite um numero de 100 a 200: ");
        int n = teclado.nextInt();
        
        if (n >= 100 && n <= 200) {
        
          System.out.print("O numero "+n+" esta no intervalo de 100 e 200");
          
        
        } else {
            
            System.out.print("O numero "+n+" não esta no intervalo de 100 e 200"); 
            
            }
       
    }
    
}
