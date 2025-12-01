
package Aula02_Ex12_Porta;

/**
 *
 * @author Ryan
 */
public class Porta {
    
    private boolean aberta;
    private String cor;

    
    public Porta(String cor) {
        this.cor = cor;
        this.aberta = false;
    }

  
    public boolean isAberta() {
        return aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    
    public void abrir() {
        aberta = true;
    }

    public void fechar() {
        aberta = false;
    }
}
    
