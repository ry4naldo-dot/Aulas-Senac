
package Aula1_Exercicios;

import java.util.Scanner;


public class Ex12_Direito_ao_Voto {
 
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
         System.out.print("Em qual ano você nasceu? ");
         int ano = teclado.nextInt();
         
         if (ano >= 2009) {
             
             System.out.print("Parabens, você já tem direeito ao voto");
             
       
         } else {
            
             System.out.print("Você não tem direito ao voto");
             
         }
        
    }
   
}
/*Crie um programa que pergunte o ano de nascimento de uma pessoa e 
determine se ela já tem idade para votar (16 anos ou mais). 
Exiba uma mensagem informando se a pessoa tem direito ao voto.*/