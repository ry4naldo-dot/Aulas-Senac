
package Aula02_Ex05_Produto;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Main {
    
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Camiseta",39.90,50);
        
        /*Produto produto1 = new Produto();
        produto1.nome = "Camiseta";
        produto1.preco = 39.90;
        produto1.quantidadeEmEstoque = 50;*/
     
        System.out.println("Produto: "+p1.getNome());
        System.out.println("Preço: "+p1.getPreco());
        System.out.println("Estoque: "+p1.getQuantidadeEmEstoque());
        
        p1.vender(10);
        p1.reporEstoque(20);
        
        System.out.println("Estoque: "+p1.getQuantidadeEmEstoque());
        
    }
    
}
