
package Avaliacao;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Vendedor extends Usuario{
    
    private double metaVendas;

    public Vendedor(String nome, String id, double metaVendas) {
        super(nome, id);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }
    
}
