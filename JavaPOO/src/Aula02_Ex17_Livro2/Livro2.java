
package Aula02_Ex17_Livro2;

/**
 *
 * @author Ryan
 */
public class Livro2 {
    
    private String titulo;
    private String autor;
    private int anoPublicacao;

    
    public Livro2(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = 0; 
    }

   
    public Livro2(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }  
}
