
package Aula03_Ex02_Animal;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Cachorro implements Animal{
    
    private String nome,raca;

    public Cachorro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    @Override
    public void emitirSom() {
       
        System.out.println("Au-au");
        
    }
}
