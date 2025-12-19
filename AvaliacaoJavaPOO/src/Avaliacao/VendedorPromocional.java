
package Avaliacao;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class VendedorPromocional extends Vendedor implements Promocional{

    public VendedorPromocional(String nome, String id, double metaVendas) {
        super(nome, id, metaVendas);
    }

    @Override
    public String aplicarPromocao() {
       
        return "Bônus de meta ativado para o vendedor.";
    }
    
}
