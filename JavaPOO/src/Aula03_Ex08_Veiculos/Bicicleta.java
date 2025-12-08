
package Aula03_Ex08_Veiculos;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Bicicleta implements Veiculo{
    
    private String marca, modelo;
    private int ano;

    public Bicicleta(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
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

    @Override
    public void acelerar() {
        System.out.println("A bicicleta esta acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("A bicicleta esta freando.");
    }

    @Override
    public void virar(String direcao) {
        System.out.println("A bicicleta esta virando para "+direcao);
    } 
}
