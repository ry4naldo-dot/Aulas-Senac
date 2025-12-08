
package Aula03_Ex06_DispositivosEletronicos;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Celular implements DispositivoEletronico{
    
    private boolean ligado;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("O Celular foi ligado");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("O Celular foi desligado");
    }

    @Override
    public void obterStatus() {
        String status = ligado ? "Celular Ligada" : "Celular Desligada";
        System.out.println(status);
    }
    
}
