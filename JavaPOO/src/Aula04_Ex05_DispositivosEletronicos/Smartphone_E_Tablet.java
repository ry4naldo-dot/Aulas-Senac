
package Aula04_Ex05_DispositivosEletronicos;

/**
 *
 * @author Ryan
 */
public class Smartphone_E_Tablet extends Dispositivo_Eletronico{
    
    private String tamanho_da_tela;

    public Smartphone_E_Tablet(String marca, String modelo, String tamanho_da_tela) {
        super(marca, modelo);
        this.tamanho_da_tela = tamanho_da_tela;
    }

    public String getTamanho_da_tela() {
        return tamanho_da_tela;
    }

    public void setTamanho_da_tela(String tamanho_da_tela) {
        this.tamanho_da_tela = tamanho_da_tela;
    }
    
}
