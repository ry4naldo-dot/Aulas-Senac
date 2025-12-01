
package Aula02_Ex11_Televisao;

/**
 *
 * @author Ryan
 */
public class Televisao {
    
    private int volume;
    private int canal;

    
    public Televisao(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }

    
    public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    
    void aumentarVolume() {
        volume++;
    }

    void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    void trocarCanal(int novoCanal) {
        if (novoCanal > 0) {
            canal = novoCanal;
        }
    }
}

