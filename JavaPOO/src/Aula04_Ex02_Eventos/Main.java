
package Aula04_Ex02_Eventos;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        //Show
        System.out.print("Digite o nome do show: ");
        String nomeShow = teclado.nextLine();       
        System.out.print("Digite a data do show: ");
        String dataShow = teclado.nextLine();       
        System.out.print("Digite o nome do artista: ");
        String nomeArtista = teclado.nextLine();      
        Show s1 = new Show(nomeShow,dataShow,nomeArtista);
        
        //Palestra
        System.out.print("\nDigite o nome da palestra: ");
        String nomePal = teclado.nextLine();
        System.out.print("Digite a data da palestra: ");
        String dataPal = teclado.nextLine();
        System.out.print("Digite o nome do palestrante:");
        String Palnome = teclado.nextLine();
        Palestra p1 = new Palestra(nomePal,dataPal,Palnome);
        
        //Workshop
        System.out.print("\nDigite o nome da workshop: ");
        String nomeWork = teclado.nextLine();
        System.out.print("Digite a data da workshop: ");
        String dataWork = teclado.nextLine();
        System.out.print("Digite o nome do instrutor: ");
        String nomeInstrutor = teclado.nextLine();
        Workshop w1 = new Workshop(nomeWork,dataWork,nomeInstrutor);
        
        //Exibição
        System.out.println("\nShow: "+s1.nome+"\nData: "+s1.data+"\nArtista: "+s1.getArtista());
        System.out.println("Palestra: "+p1.nome+"\nData: "+p1.data+"\nPalestrante: "+p1.getPalestrante());
        System.out.println("Workshop: "+w1.nome+"\nData: "+w1.data+"\nInstrutor: "+w1.getInstrutor());
        
    }
    
}
