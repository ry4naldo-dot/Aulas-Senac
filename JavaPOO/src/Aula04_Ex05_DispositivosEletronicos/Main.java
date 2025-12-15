
package Aula04_Ex05_DispositivosEletronicos;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        //Smartphone
        System.out.println("Digite a marca do smartphone: ");
        String marcaS = teclado.nextLine();
        System.out.println("Digite o modelo do smartphone: ");
        String modeloS = teclado.nextLine();
        System.out.println("Digite o tamanho da tela: ");
        String tamS = teclado.nextLine();
        Smartphone_E_Tablet s1 = new Smartphone_E_Tablet(marcaS,modeloS,tamS);
        
        //Notebook
        System.out.println("Digite a marca do notebook: ");
        String marcaN = teclado.nextLine();
        System.out.println("Digite o modelo do notebook: ");
        String modeloN = teclado.nextLine();
        System.out.println("Digite a quantidade de armazenamento: ");
        double armN = teclado.nextDouble();
        Notebook n1 = new Notebook(marcaN,modeloN,armN);
        
        //Exibição
        System.out.println("Smartphone: "+s1.marca+"\nModelo: "+s1.modelo+"\nTamanho da tela: "+s1.getTamanho_da_tela());
        System.out.println("Notebook: "+n1.marca+"\nModelo: "+n1.modelo+"\nArmazenamento: "+n1.getArmazenamento()+"GB");
        
    }
    
}
