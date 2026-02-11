
package projetoint;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Doador {
    
    public String nomeDoa,sobreDoa,numeroT,cpf;
    public int idade;

    public Doador(String nomeDoa, String sobreDoa, int idade,String numeroT, String cpf) {
        this.nomeDoa = nomeDoa;
        this.sobreDoa = sobreDoa;
        this.idade = idade;
        this.numeroT = numeroT;
        this.cpf = cpf;
    }

    public String getNomeDoa() {
        return nomeDoa;
    }

    public void setNomeDoa(String nomeDoa) {
        this.nomeDoa = nomeDoa;
    }

    public String getSobreDoa() {
        return sobreDoa;
    }

    public void setSobreDoa(String sobreDoa) {
        this.sobreDoa = sobreDoa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNumeroT() {
        return numeroT;
    }

    public void setNumeroT(String numeroT) {
        this.numeroT = numeroT;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
