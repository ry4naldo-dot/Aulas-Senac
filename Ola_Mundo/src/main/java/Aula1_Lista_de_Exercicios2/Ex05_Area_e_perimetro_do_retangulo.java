
package Aula1_Lista_de_Exercicios2;

import java.util.Scanner;


public class Ex05_Area_e_perimetro_do_retangulo {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a base: ");
        double base = teclado.nextDouble();
        
        System.out.print("Digite a altura: ");
        double alt = teclado.nextDouble();
        
        double area = (base * alt) / 2;
        double per = base + alt;
        
        System.out.println(area);
        
        System.out.println(per);
        
    }
    
}
