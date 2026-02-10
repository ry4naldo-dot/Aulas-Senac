
package projetoint;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Doador {
    
    public String nomeDoa,sobreDoa;
    public int idade,numeroT, cpf;

    public Doador(String nomeDoa, String sobreDoa, int idade,int numeroT, int cpf) {
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

    public int getNumeroT() {
        return numeroT;
    }

    public void setNumeroT(int numeroT) {
        this.numeroT = numeroT;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

}
