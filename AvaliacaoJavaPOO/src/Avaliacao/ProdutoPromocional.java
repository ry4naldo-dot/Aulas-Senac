
package Avaliacao;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class ProdutoPromocional extends Produto implements Promocional{

    public ProdutoPromocional(String nome, String codigo) {
        super(nome, codigo);
    }

    @Override
    public String aplicarPromocao() {
        if(getPreco() >= 100){
            
            return "Desconto de 10% aplicado.";
            
        }else{
            
            return "Sem desconto disponível.";
            
        }
    }
    
}
