
package Aula03_Ex02_Animal;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Gato implements Animal{
    
    private String nome;

    @Override
    public void emitirSom() {
        
        System.out.println("Miau");
        
    }

    public Gato(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
