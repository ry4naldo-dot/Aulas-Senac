
package Aula03_Ex07_FormasDePagamentos;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Main {
    
    public static void main(String[] args) {
        
        CartaoCredito cc = new CartaoCredito();
        cc.efetuarPagamento(67.69);
        
        Boleto b = new Boleto();
        b.efetuarPagamento(1258.67);
        
        Dinheiro d = new Dinheiro();
        d.efetuarPagamento(2094.00);
        
    }
    
}
