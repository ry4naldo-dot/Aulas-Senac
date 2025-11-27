
package Aula02_Ex03_Carro;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Main {
    
    public static void main(String[] args) {
        
        Carro c1 = new Carro("Honda","Civic",2010,false);
        
        System.out.println("Modelo: "+c1.getModelo());
        System.out.println("Marca: "+c1.getMarca());
        System.out.println("Ano: "+c1.getAno());
        System.out.println("O carro está Ligado? "+(c1.getLigado()? "Sim" : "Não"));
        
        c1.ligar();
        c1.desligar();
        
    }
    
}
