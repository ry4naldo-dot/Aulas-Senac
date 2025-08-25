package Aula1_Exercicios;

import java.util.Scanner;


public class Ex03_Dobro_e_Terça_Parte {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite qualquer numero:");
        double num = teclado.nextDouble();
        
        double terc = num / 3;
        
        double dob = num * 2;
       
        System.out.printf("O terço de "+num+" eh %.4f%n", terc);
       
        System.out.println("O dobro de "+num+" eh:"+dob);
       
    }
    
}
