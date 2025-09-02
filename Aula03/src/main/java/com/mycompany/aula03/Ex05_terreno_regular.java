
package com.mycompany.aula03;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex05_terreno_regular {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o comprimento: ");
        double com = teclado.nextDouble();
        
        System.out.print("Digite a largura: ");
        double lar = teclado.nextDouble();
       
        double m2 = com * lar;
       
      if (m2 < 100) {
    
       System.out.print("Terreno Popular "+m2+"m2");   
    
    } else if (m2 >= 100 && m2 <= 500) {
    
       System.out.print("Terreno Master "+m2+"m2");
    
    } else if (m2 > 500) {
    
      System.out.print("Terreno VIP "+m2+"m2");
    
   } 
   
   }  
     
}
/*Escreva ("Escreva o comprimento e a largura:")
Leia (comprimento, largura)


m2 <- comprimento * largura


Se m2 < 100 entao

 Escreval ("Terreno Popular",m2,"m2")
 
Fimse

Se((m2 >= 100) e (m2 < 500)) entao


 Escreval ("Terreno Master", m2,"m2")

Fimse

Se m2 >= 500 entao

 Escreval ("Terreno VIP", m2,"m2")
 
Fimse*/