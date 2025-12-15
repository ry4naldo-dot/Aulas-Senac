
package Aula04_Ex03_Funcionarios;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Vendedor extends Funcionario{
    
    private String comissao;

    public Vendedor(String nome, String cargo, double salario, String comissao) {
        super(nome, cargo, salario);
        this.comissao = comissao;
    }

    public String getComissao() {
        return comissao;
    }

    public void setComissao(String comissao) {
        this.comissao = comissao;
    }
    
}
