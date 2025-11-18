
package Aula01_Exercício03;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Main_Ex03 {
    
    public static void main(String[] args) {
        
        Carro carro1 = new Carro();
        carro1.marca = "Honda";
        carro1.modelo = "Civic";
        carro1.ano = 2010;
        carro1.ligado = true;
        
        carro1.ligar();
        carro1.desligar();
        
    }
    
}
