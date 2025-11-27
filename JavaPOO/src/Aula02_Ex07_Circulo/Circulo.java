
package Aula02_Ex07_Circulo;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Circulo {
    
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    double calcularArea() {
        
        return Math.PI * raio * raio;
        
    }

    double calcularCircunferencia() {
        
        return 2 * Math.PI * raio;
        
    }
    
}
