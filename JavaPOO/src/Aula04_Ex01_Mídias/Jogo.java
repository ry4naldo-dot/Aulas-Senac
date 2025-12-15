
package Aula04_Ex01_Mídias;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Jogo extends Midia{
    
    private String plataforma,classificacao;

    public Jogo(String titulo, String duracao, String plataforma, String classificacao) {
        super(titulo, duracao);
        this.plataforma = plataforma;
        this.classificacao = classificacao;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
    
}
