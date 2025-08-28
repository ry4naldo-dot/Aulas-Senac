
package com.mycompany.aula02;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex01_Verificar_se_um_número_é_par {
   
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num = teclado.nextInt();
        
        boolean par = (0 == num % 2);
        
        System.out.println("O numero: "+num+" é par: "+par);
        
    }
    
}
/*Utiliza boolean para determinar se um número inteiro é par.*/