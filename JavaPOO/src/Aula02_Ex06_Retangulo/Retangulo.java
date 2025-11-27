
package Aula02_Ex06_Retangulo;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Retangulo {
    
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
    
    double calcularArea() {
        
        return largura * altura;
        
    }

    double calcularPerimetro() {
        
        return 2 * (largura + altura);
        
    }
}
