
package Aula03_Ex11_Formas;

/**
 *
 * @author Ryan
 */
public class Circuo implements Forma{
    
    private double raio;

    public Circuo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        
        System.out.println(Math.PI * raio * raio);
        
    }

    @Override
    public void calcularPerimetro() {
        
        System.out.println(2 * Math.PI * raio);
        
    }   
}
