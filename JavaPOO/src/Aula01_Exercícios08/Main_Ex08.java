
package Aula01_Exercícios08;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Main_Ex08 {
    
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno();
        //aluno1.nome = "Perigo";
        //aluno1.matricula = 12345;
        //aluno1.notas = new double[]{7.5,8.0,6.0,9.5};
                
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        aluno1.nome = teclado.nextLine();
        
        System.out.println("Digite a matricula do aluno:");
        aluno1.matricula = teclado.nextInt();
        
        System.out.println("Digite a quantidade de notas:");
        int quantidadeNotas = teclado.nextInt();
        aluno1.notas = new double[quantidadeNotas];
        
        for (int i = 0; i < quantidadeNotas; i++) {
            
            System.out.println("Digite a nota "+(i+1)+":");
            aluno1.notas[i] = teclado.nextDouble();
            
        }
        
        double media = aluno1.calcularMedia();
        System.out.println("Média do aluno "+aluno1.nome+" : "+media);
        
    }
    
}
