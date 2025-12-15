
package Aula04_Ex04_Eletrodomesticos;

/**
 *
 * @author Ryan
 */
public class Televisao extends Eletrodomestico{
    
    private String canal;
    private int volumne;

    public Televisao(String marca, String modelo, boolean ligado, String canal, int volume) {
        super(marca, modelo, ligado);
        this.canal = canal;
        this.volumne = volume;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public int getVolumne() {
        return volumne;
    }

    public void setVolumne(int volumne) {
        this.volumne = volumne;
    }
    
}
