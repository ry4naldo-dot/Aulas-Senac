
package com.mycompany.aula02;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex06_Determinar_o_maior_de_dois_numeros {
   
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int n1 = teclado.nextInt();
        
        System.out.print("Digite outro numero: ");
        int n2 = teclado.nextInt();
        
        System.out.print("Digite outro numero: ");
        int n3 = teclado.nextInt();
        
        if (n1 > n2 && n1 > n3) {
            
            System.out.print("O numero "+n1+" é o maior de todos");
            
        }
        
        if (n2 > n1 && n2 > n3) {
        
            
           System.out.print("O numero "+n2+" é o maior de todos");
        
        }
        
        if (n3 > n1 && n3 > n2) {
            
            System.out.print("O numero "+n3+" é o maior de todos");
            
        }
       
        if ((n1 == n2 && n1 == n3) || (n2 == n1 && n2 == n3) || (n3 == n1 && n3 == n2)) {
        
            System.out.print("Todos os numeros são iguais");
        
        }
        
    }
    
}
