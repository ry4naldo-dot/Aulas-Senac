
package Aula03_Ex02_Animal;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Passaro implements Animal{
 
    private String nome;

    @Override
    public void emitirSom() {
        
        System.out.println("có-có");
        
    }

    public Passaro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
