
package Aula02_Ex03_Carro;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Carro {
    
    private String marca, modelo;
    private int ano;
    private boolean ligado;

    public Carro(String marca, String modelo, int ano, boolean ligado) {
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
    
    
    
    void ligar(){
              
        if(ligado){
            
            ligado = false;
            System.out.println("Carro "+modelo+" ligado com sucesso.");
            
        }else{
            
            System.out.println("Carro "+modelo+" não está disponivel.");
            
        }
        
    }
    
    void desligar(){
        
        if(!ligado){
            ligado = true;
            System.out.println("Carro "+modelo+" desligado com sucesso.");
            
        }else{
            
            System.out.println("Carro "+modelo+" já está desligado.");
            
        }
        
    }
    
}
