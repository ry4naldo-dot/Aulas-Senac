
package Danonation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Outros {
    
    private int id;
    public String nome,item,infID;
    public int quantidade;
    LocalDate data = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String datastring = data.format(formatter);

    public Outros(int id, String nome, String item, int quantidade, String dataString, String infID) {
        this.id = id;
        this.nome = nome;
        this.item = item;
        this.quantidade = quantidade;
        this.datastring = dataString;
        this.infID = infID;
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

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getInfID() {
        return infID;
    }

    public void setInfID(String infID) {
        this.infID = infID;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public DateTimeFormatter getFormatter() {
        return formatter;
    }

    public void setFormatter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    public String getDatastring() {
        return datastring;
    }

    public void setDatastring(String datastring) {
        this.datastring = datastring;
    }

}
