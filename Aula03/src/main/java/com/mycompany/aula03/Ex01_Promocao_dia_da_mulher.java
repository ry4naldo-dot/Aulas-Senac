
package com.mycompany.aula03;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex01_Promocao_dia_da_mulher {
  
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.println("Informe seu sexo: ");
        String sexo = teclado.nextLine();
        
        System.out.println("Digite o valor da compra: ");
        double val = teclado.nextDouble();
        
        if ("masculino".equals(sexo)) {
            
            double desc = val - (val * 0.05);
            
            System.out.println("Parabens "+nome+" você ganhou um desconto de 5%, total de "+desc+" R$");
            
        } else if ("feminino".equals(sexo)){
            
            double desc = val - (val * 0.13);
            
            System.out.println("Parabens "+nome+" você ganhou um desconto de 13%, total de "+desc+" R$");
            
        } else {
            
            System.out.println("Sexo invalido");
            
        }
       
    }
   
}