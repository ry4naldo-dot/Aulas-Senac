
package Aula1_Lista_de_Exercicios2;

import java.util.Scanner;


public class Ex08_Minutos_em_horas_e_minutos {
  
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite em minutos: ");
        double min = teclado.nextDouble();
        
        double hora = (min / 60);
        
        System.out.printf("Em horas: %.2f%n", hora);
       
    }
    
}
