
package Aula01_Exercício07;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Main_Ex07 {
 
    public static void main(String[] args) {
        
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Quixote";
        livro1.autor = "Miguel de Cervantes";
        livro1.anoPublicacao = 1605;
        livro1.disponivel = true;
        
        livro1.devolver();
        livro1.emprestar();
        
    }
    
}
