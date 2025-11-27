
package Aula02_Ex04_Livro;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Main {
    
    public static void main(String[] args) {
        
        Livro l1 = new Livro("Dom Quixote","Miguel de Cervantes",1605,true);
        
        System.out.println("Modelo: "+l1.getTitulo());
        System.out.println("Marca: "+l1.getAutor());
        System.out.println("Ano: "+l1.getAnoPublicacao());
        System.out.println("O carro está Ligado? "+(l1.getDisponivel()? "Sim" : "Não"));
        
        l1.devolver();
        l1.emprestar();
        
    }
    
}
