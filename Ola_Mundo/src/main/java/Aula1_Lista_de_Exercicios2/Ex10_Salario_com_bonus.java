
package Aula1_Lista_de_Exercicios2;

import java.util.Scanner;


public class Ex10_Salario_com_bonus {
   
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.print("Digite seu salario: ");
        double sal = teclado.nextDouble();
        
        System.out.print("Quantos anos você esta na empresa: ");
        double ano = teclado.nextDouble();
        
        double aumento = sal + (sal * (ano / 100));
        double por = ano / 100;
        System.out.println("Parabens,"+nome+" Você recebeu um aumento de: "+por+"%, total de:"+aumento);
      
    }
    
}
/*%.2f%n*/