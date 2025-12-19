
package Avaliacao;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Produto {
    
    private String nome, codigo;
    private double preco;

    public Produto(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco >= 0){
            
            this.preco = preco;
            
        }else{
            
            System.out.println("ERRO!... \nInsira um preço valor positivo");
            
        }
        
    }

    public void StatusDoProduto() {
        System.out.println("Produto: " + nome + " - Código: " + codigo + " - Preço: R$" + preco);
    }
    
}
