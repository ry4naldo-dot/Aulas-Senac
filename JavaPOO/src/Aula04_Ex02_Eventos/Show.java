
package Aula04_Ex02_Eventos;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Show extends Evento{
    
    private String artista;

    public Show(String nome, String data, String artista) {
        super(nome, data);
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
    
}
