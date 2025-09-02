
package com.mycompany.aula03;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex02_distancia_em_km {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual distância você deseja percorrer em km:");
        double km = teclado.nextDouble();
        
        if (km <= 200) {
            
            double valor = km * 0.50;
            
            System.out.print("O valor da viagem é: "+valor);
            
        } else {
            
            double valor = km * 0.45;
         
            System.out.print("O valor da viagem é: "+valor);
            
        }
        
    }
   
}
/*Escreva ("Qual distância que você deseja percorrer em km: ")
Leia (km)


Se km <= 200 entao

 valor <- km * 0.50

 Senao
 
 valor <- km * 0.45
 
  Fimse

Escreval ("O valor da viagem é: ", valor)*/