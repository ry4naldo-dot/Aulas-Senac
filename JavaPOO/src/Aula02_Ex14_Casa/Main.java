
package Aula02_Ex14_Casa;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o nome do proprietário: ");
        String nomeProprietario = teclado.nextLine();
        
        System.out.println("Digite o número da casa: ");
        int numeroCasa = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Digite a cor da casa: ");
        String corCasa = teclado.nextLine();
        
        Pessoa p1 = new Pessoa(nomeProprietario);
        Casa c1 = new Casa(numeroCasa,corCasa,p1);
        
        System.out.println("\n --- Dados da Casa --- ");
        System.out.println("Número da casa: "+c1.getNumero());
        System.out.println("Cor da casa: "+c1.getCor());
        System.out.println("Proprietário: "+c1.getProprietario().getNome());
        
    }
    
}
