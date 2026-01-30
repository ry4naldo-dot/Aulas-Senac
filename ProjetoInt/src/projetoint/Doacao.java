
package projetoint;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Doacao {
    
    private int id;
    public String nome,sobrenome,numero,item,quant,data;

    public Doacao(int id, String nome, String sobrenome, String numero, String item, String quant, String data) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numero = numero;
        this.item = item;
        this.quant = quant;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getQuant() {
        return quant;
    }

    public void setQuant(String quant) {
        this.quant = quant;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
