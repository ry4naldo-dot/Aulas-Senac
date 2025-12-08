
package Aula03_Ex03_FiguraGeometrica;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Circulo implements FiguraGeometrica{
    
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

    @Override
    public void calcularArea() {
        
        System.out.println(Math.PI * raio * raio);
        
    }

    @Override
    public void calcularPerimetro() {
        
        System.out.println(2 * Math.PI * raio);
        
    }
}
