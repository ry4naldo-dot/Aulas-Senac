
package Aula01_Exercício09;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Main_Ex09 {
    
    public static void main(String[] args) {
        
        Produto produto1 = new Produto();
        produto1.nome = "Camiseta";
        produto1.preco = 39.90;
        produto1.quantidadeEmEstoque = 50;
        
        produto1.vender(10);
        produto1.reporEstoque(20);
        
        
    }
    
}
