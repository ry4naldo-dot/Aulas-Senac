
package Aula1_Exercicios;

import java.util.Scanner;


public class Ex11_Multa_por_Excesso_de_Velocidade {
  
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual a velocidade do carro? ");
        double vel = teclado.nextDouble();
        
        if (vel > 80) {
            
            double mul = vel * 5;
            
            System.out.print("Você foi multado em: "+mul+"R$");
            
        } else {
            
            System.out.print("Você não passou do limite de velocidade"); 
            
        }
        
    }
    
}
/*Em uma rodovia, a velocidade máxima permitida é de 80 km/h.
Crie um programa que pergunte a velocidade de um carro e calcule a multa, caso o motorista tenha excedido o limite. 
A multa é de R$ 5 por cada km/h acima do limite. Exiba uma mensagem informando 
se o motorista foi multado e, em caso afirmativo, qual o valor da multa.
*/