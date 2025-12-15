
package Aula04_Ex01_Mídias;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Música extends Midia{
    
    private String album, artista;

    public Música(String titulo, String duracao, String album, String artista) {
        super(titulo, duracao);
        this.album = album;
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
    
}
