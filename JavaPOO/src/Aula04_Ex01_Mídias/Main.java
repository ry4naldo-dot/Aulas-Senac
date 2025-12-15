
package Aula04_Ex01_Mídias;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        //Música
        System.out.print("Digite o Titulo da Música: ");
        String tituloMusica = teclado.nextLine();       
        System.out.print("Digite a duração da música: ");
        String tempoMusica = teclado.nextLine();       
        System.out.print("Digite o nome do album: ");
        String nomeAlbum = teclado.nextLine();      
        System.out.print("Digite o nome do artista: ");
        String nomeArtista = teclado.nextLine();
        Música m1 = new Música(tituloMusica,tempoMusica,nomeAlbum,nomeArtista);
        
        //Filme
        System.out.print("\nDigite o Titulo do filme: ");
        String tituloFilme = teclado.nextLine();
        System.out.print("Digite a duração do filme: ");
        String tempoFilme = teclado.nextLine();
        System.out.print("Digite o nome do diretor:");
        String nomeDiretor = teclado.nextLine();
        System.out.print("Digite o gênero do filme:");
        String nomeGenero = teclado.nextLine();
        Filme f1 = new Filme(tituloFilme,tempoFilme,nomeDiretor,nomeGenero);
        
        //Jogo
        System.out.print("\nDigite o nome do jogo: ");
        String tituloJogo = teclado.nextLine();
        System.out.print("Digite a duração do jogo: ");
        String tempoJogo = teclado.nextLine();
        System.out.print("Digite As plataformas do jogo: ");
        String nomePlataformas = teclado.nextLine();
        System.out.print("Digite a classificação: ");
        String idadeCla = teclado.nextLine();
        Jogo j1 = new Jogo(tituloJogo,tempoJogo,nomePlataformas,idadeCla);
        
        //Exibição
        System.out.println("\nMúsica: "+m1.titulo+"\nDuração: "+m1.duracao+"\nAlbum: "+m1.getAlbum()+"\nArtista: "+m1.getArtista());
        System.out.println("Filme: "+f1.titulo+"\nDuração: "+f1.duracao+"\nDiretor: "+f1.getDiretor()+"\nGênero: "+f1.getGenero());
        System.out.println("Jogo: "+j1.titulo+"\nDuração: "+j1.duracao+"\nPlataforma: "+j1.getPlataforma()+"\nClassifição: "+j1.getClassificacao());
        
    }
    
}
