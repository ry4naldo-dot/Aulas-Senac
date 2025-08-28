
package com.mycompany.aula02;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex02_Verificar_se_um_ano_é_bis {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um ano: ");
        int ano = teclado.nextInt();
        
        boolean bi = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
        
        System.out.println("O ano de "+ano+" é bissexto? "+bi);
       
    }
    
}
/*Exercício 2 – Verificar se um ano é bissexto
Utiliza boolean para aplicar a regra de ano bissexto.
se (ano % 4 = 0) e (ano % 100 <> 0) ou (ano % 400 = 0) entao*/