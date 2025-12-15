
package Aula04_Ex05_DispositivosEletronicos;

/**
 *
 * @author Ryan
 */
public class Notebook extends Dispositivo_Eletronico{
    
    private double armazenamento;

    public Notebook(String marca, String modelo, double armazenamento) {
        super(marca, modelo);
        this.armazenamento = armazenamento;
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }
    
}
