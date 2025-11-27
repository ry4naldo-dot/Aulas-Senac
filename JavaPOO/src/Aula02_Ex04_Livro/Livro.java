
package Aula02_Ex04_Livro;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Livro {
    
    private String titulo, autor;
    private int anoPublicacao;
    private boolean disponivel;

    public Livro(String titulo, String autor, int anoPublicacao, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    void emprestar() {
        
        if(disponivel){
            
            disponivel = false;
            System.out.println("Livro "+titulo+" emprestado com sucesso.");
            
        }else{
            
            System.out.println("Livro "+titulo+" não está disponivel para empréstimo.");
            
        }
        
    }
    
    void devolver(){
        
        if(!disponivel){
            disponivel = true;
            System.out.println("Livro "+titulo+" devolvido com sucesso.");
            
        }else{
            
            System.out.println("Livro "+titulo+" já está disponíel.");
            
        }
        
    }
    
}
