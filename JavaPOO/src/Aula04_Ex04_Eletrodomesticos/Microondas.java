
package Aula04_Ex04_Eletrodomesticos;

/**
 *
 * @author Ryan
 */
public class Microondas extends Eletrodomestico{
    
    private String potencia;

    public Microondas(String marca, String modelo, boolean ligado, String potencia) {
        super(marca, modelo, ligado);
        this.potencia = potencia;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
    
}
