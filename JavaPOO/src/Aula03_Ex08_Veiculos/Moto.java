
package Aula03_Ex08_Veiculos;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Moto implements Veiculo{
    
    private String marca, modelo;
    private int ano;
    private boolean ligado;

    public Moto(String marca, String modelo, int ano, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = ligado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public void acelerar() {
        System.out.println("A moto esta acelerando!");
    }

    @Override
    public void frear() {
        System.out.println("A moto esta freando . . .");
    }

    @Override
    public void virar(String direcao) {
        System.out.println("A moto esta virando para a "+direcao);
    }
}
