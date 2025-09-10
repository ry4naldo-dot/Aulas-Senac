package Aula05_Do_While;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex02_Média_de_notas_com_validação {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int soma = 0;
        int alunos = 1;
        double nota;
        double med = 0;
        
        do {
            
            System.out.println("Digite a nota do aluno: ");
            nota = teclado.nextDouble();
            
            if (nota < 0 || nota > 10) {
           
                System.out.println("Nota inválida!");
               
            } else {
                
                soma += nota;
                alunos++;
                
            }
            
           
            
        } while (alunos <= 4);
        
        med = soma / 4;
        
        System.out.println("A média das notas são: "+med);
        
    }
    
}