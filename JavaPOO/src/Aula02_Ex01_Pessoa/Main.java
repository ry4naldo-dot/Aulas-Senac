
package Aula02_Ex01_Pessoa;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Main {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Marcos",25, 1.79);
        
        System.out.println("\nInformações da Pessoa: ");
        System.out.println("Nome: "+p1.getNome());
        System.out.println("Idade: "+p1.getIdade());
        System.out.println("Altura: "+p1.getAltura());
        
        
        
    }
    
}
