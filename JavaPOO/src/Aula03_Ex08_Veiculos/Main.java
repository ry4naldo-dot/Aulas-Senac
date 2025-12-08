
package Aula03_Ex08_Veiculos;

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
        
        c1.acelerar();
        c1.virar("Esquerda");
        
        Moto m1 = new Moto("Honda","Hornet",2009,true);
        
        System.out.println("Modelo: "+m1.getModelo());
        System.out.println("Marca: "+m1.getMarca());
        System.out.println("Ano: "+m1.getAno());
        System.out.println("O carro está Ligado? "+(m1.getLigado()? "Sim" : "Não"));
        
        m1.frear();
        m1.virar("Direito");
        
        Bicicleta b1 = new Bicicleta("BMX","Bike",2015);
        
        System.out.println("Modelo: "+b1.getModelo());
        System.out.println("Marca: "+b1.getMarca());
        System.out.println("Ano: "+b1.getAno());
        
        b1.virar("O beco escuro");
        
    }
    
}
