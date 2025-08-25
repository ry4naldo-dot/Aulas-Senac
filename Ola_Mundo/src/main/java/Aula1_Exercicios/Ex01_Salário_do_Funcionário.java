package Aula1_Exercicios;


import java.util.Scanner;


public class Ex01_Salário_do_Funcionário {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual o seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.print("Qual o seu salario: ");
        int sal = teclado.nextInt();
        
        System.out.println("Parabens "+nome+", seu salario eh de: "+sal);
       
    }
    
}
