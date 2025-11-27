
package Aula02_Ex05_Produto;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Produto {
    
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    
    void vender(int quantidade){
        
        if(quantidade <= quantidadeEmEstoque){
            
            quantidadeEmEstoque -= quantidade;
            System.out.println("Venda de "+quantidade+" unidades de "+nome+" realizada com sucesso.");
            
        }else{
            
            System.out.println("Estoque insuficiente para a venda.");
            
        }
        
    }
    
    void reporEstoque(int quantidade){
        
        quantidadeEmEstoque += quantidade;
        System.out.println("Estoque de "+nome+" reposto com "+quantidade+" unidades");
        
    }
    
}
