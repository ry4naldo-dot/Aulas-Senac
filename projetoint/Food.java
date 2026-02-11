
package projetoint;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Food {
    
    private int id;
    public String nomeF, comida, infID;
    public double peso;
    //public int infID;
    LocalDate dataF = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String dataFstring = dataF.format(formatter);

    public Food(int id, String nomeF, String comida,double peso,String dataValidade, String infID) {
        this.id = id;
        this.nomeF = nomeF;
        this.comida = comida;
        this.peso = peso;
        this.infID = infID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeF() {
        return nomeF;
    }

    public void setNomeF(String nomeF) {
        this.nomeF = nomeF;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getInfID() {
        return infID;
    }

    public void setInfID(String infID) {
        this.infID = infID;
    }

    public LocalDate getDataF() {
        return dataF;
    }

    public void setDataF(LocalDate dataF) {
        this.dataF = dataF;
    }

    public DateTimeFormatter getFormatter() {
        return formatter;
    }

    public void setFormatter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    public String getDataFstring() {
        return dataFstring;
    }

    public void setDataFstring(String dataFstring) {
        this.dataFstring = dataFstring;
    }
    
}
