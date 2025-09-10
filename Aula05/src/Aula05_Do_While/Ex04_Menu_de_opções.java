
package Aula05_Do_While;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex04_Menu_de_opções {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String op;
        
        do {
        
        System.out.println("====================");
        System.out.println("   1- Cadastrar");
        System.out.println("   2- Consultar");
        System.out.println("     3- Sair");
        op = teclado.next();
        System.out.println("====================");
         
         if ("1".equals(op)){
             
             System.out.println("Digite seu nome: ");
             String nome = teclado.next();
             System.out.println("Digite sua senha: ");
             int senha = teclado.nextInt();
             
         } else if ("2".equals(op)) {
             
             System.out.println("---Coisas de consulta---");
             
         }
        
        
        } while (!"3".equals(op));
        
        System.out.println("Saindo...");
        
    }
    
}
