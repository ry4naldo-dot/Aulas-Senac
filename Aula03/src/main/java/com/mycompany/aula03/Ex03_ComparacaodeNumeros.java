
package com.mycompany.aula03;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex03_ComparacaodeNumeros {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int n1 = teclado.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int n2 = teclado.nextInt();
        
        if (n1 > n2) {
            
            System.out.print("O primeiro valor é maior que o segundo");
            
        } else if (n1 < n2) {
            
            System.out.print("O segundo valor é maior que o primeiro");
            
        } else if (n1 == n2) {
            
            System.out.print("Os dois são iguais");
            
        }
        
    }
    
}
/*Escreva ("Selecione dois numeros: ")
Leia (a, b)

Se (a > b) entao

 Escreval ("O primeiro valor é o maior")
 
 Fimse
 
Se (a < b) entao

 Escreval ("O segundo valor é o maior")
 
 Fimse
 
Se (a = b) entao

 Escreval ("Os dois são igual")

Fimse*/