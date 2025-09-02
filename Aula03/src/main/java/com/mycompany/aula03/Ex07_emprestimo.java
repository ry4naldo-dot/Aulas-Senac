
package com.mycompany.aula03;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex07_emprestimo {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o valor da casa: R$");
        double valorcasa = teclado.nextDouble();
        
        System.out.print("Digite seu salario mensal: R$");
        double sal = teclado.nextDouble();
        
        System.out.print("Em quantos anos você pretende pagar? ");
        int anos = teclado.nextInt();
        
        int meses = anos * 12;
        double prestacao = valorcasa / meses;
        
        if (prestacao > sal * 0.3) {
            
            System.out.print("Empréstimo NEGADO! Prestação excede 30% do salário");
            
        } else {
            
            System.out.print("Empréstimo aprovado, Prestação dentro do limite permitido");
            
        }
        
    }
    
}