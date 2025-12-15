
package Aula04_Ex02_Eventos;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Palestra extends Evento{
    
    private String palestrante;

    public Palestra(String nome, String data, String palestrante) {
        super(nome, data);
        this.palestrante = palestrante;
    }

    public String getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(String palestrante) {
        this.palestrante = palestrante;
    }
    
}
