
package com.mycompany.aula02;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Triangulos_antigoEx07 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o primeiro lado: ");
        double l1 = teclado.nextDouble();
        
        System.out.print("Digite o segundo lado: ");
        double l2 = teclado.nextDouble();
        
        System.out.print("Digite o terceiro lado: ");
        double l3 = teclado.nextDouble();
        
        boolean tri = (l1 < l2 + l3) && (l2 < l1 + l3) && (l3 < l1 + l2);
        boolean eq = (l1 == l2) && (l2 == l3);
        boolean esca = (l1 != l2) && (l2 != l3) && (l1 != l3);
        boolean iso = (l1 == l2 && l1 != l3) || (l1 == l3 && l1 != l2) || (l2 == l3 && l2 != l1);
       
        System.out.println("Pode formar um TRIÂNGULO? "+tri);
        System.out.println("Pode formar um TRIÂNGULO EQUILÁTERO? "+eq);
        System.out.println("Pode formar um TRIÂNGULO ESCALENO? "+esca);
        System.out.println("Pode formar um TRIÂNGULO ISÓSCELES? "+iso);
      
    }
    
}
