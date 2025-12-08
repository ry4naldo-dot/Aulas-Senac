
package Aula03_Ex11_Formas;

/**
 *
 * @author Ryan
 */
public class Quadrado implements Forma{
    
    private double lado;

    public Quadrado(double lado) { 
        
        this.lado = lado;
    
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        System.out.println(lado * lado);
    }

    @Override
    public void calcularPerimetro() {
        
        System.out.println(4 * lado);
        
    }  
}
