
package Aula02_Ex17_Livro2;

/**
 *
 * @author Ryan
 */
public class Main {
    
    public static void main(String[] args) {
        
        Livro2 livro1 = new Livro2("Dom Casmurro", "Machado de Assis");
        Livro2 livro2 = new Livro2("O Hobbit", "Tolkien", 1937);
        System.out.println("Livro 1: "+livro1.getTitulo());
        System.out.println("Livro 2: "+livro2.getTitulo()+" - "+livro2.getAnoPublicacao());

        
    }
    
}
