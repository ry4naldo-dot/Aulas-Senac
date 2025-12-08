
package Aula03_Ex07_FormasDePagamentos;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Dinheiro implements FormaPagamento{

    @Override
    public void efetuarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado em dinheiro.");
    }
    
}
