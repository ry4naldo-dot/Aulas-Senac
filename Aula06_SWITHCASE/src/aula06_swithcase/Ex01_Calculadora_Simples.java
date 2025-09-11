
package aula06_swithcase;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex01_Calculadora_Simples {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String esc;
        int res = 0;
        
        System.out.println("=========================================");
        
        System.out.println("Digite o 1° número para o calculo: ");
        int n1 = teclado.nextInt();
        
        System.out.println("Digite o 2° número para o calculo: ");
        int n2 = teclado.nextInt();
        
        System.out.println("=========================================");
        
        System.out.println("Selecione se você quer somar, subtração, multiplicação e divisão.");
        
        System.out.println("[+] Soma");
        System.out.println("[-] Subtração");
        System.out.println("[*] Multiplicação");
        System.out.println("[/] Divisão");
        esc = teclado.next();
        
        System.out.println("============================================");
        
        switch (esc) {
            
            case "+":
                res = n1 + n2;
                break;
            case "-":
                res = n1 - n2;
                break;
            case "*":
                res = n1 * n2;
                break;
            case "/": 
                res = n1 / n2;
                break;
            default:
                System.out.println("Opção invalida");
                
        }
        
        System.out.println("O resultado é: "+res);
        
    }
    
}
