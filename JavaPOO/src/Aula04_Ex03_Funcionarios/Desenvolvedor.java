
package Aula04_Ex03_Funcionarios;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Desenvolvedor extends Funcionario{
    
    private String LinguagemdeProgramacao;

    public Desenvolvedor(String nome, String cargo, double salario, String LinguagemdeProgramacao) {
        super(nome, cargo, salario);
        this.LinguagemdeProgramacao = LinguagemdeProgramacao;
    }

    public String getLinguagemdeProgramacao() {
        return LinguagemdeProgramacao;
    }

    public void setLinguagemdeProgramacao(String LinguagemdeProgramacao) {
        this.LinguagemdeProgramacao = LinguagemdeProgramacao;
    }
    
}
