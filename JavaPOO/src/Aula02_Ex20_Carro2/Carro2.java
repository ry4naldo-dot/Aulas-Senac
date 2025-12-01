
package Aula02_Ex20_Carro2;

/**
 *
 * @author Ryan
 */
public class Carro2 {
    
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;

    public Carro2(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public void acelerar() {
        if (ligado) {
            System.out.println("O carro está acelerando!");
        } else {
            System.out.println("Não é possível acelerar. O carro está desligado.");
        }
    }
  
}
