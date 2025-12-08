
package Aula03_Ex03_FiguraGeometrica;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Retangulo implements FiguraGeometrica{
     
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        
        System.out.println(getLargura() * getAltura());
        
    }

    @Override
    public void calcularPerimetro() {
        
        System.out.println(2 * (getLargura() + getAltura()));
        
    }
}
