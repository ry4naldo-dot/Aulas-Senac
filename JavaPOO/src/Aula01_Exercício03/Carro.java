
package Aula01_Exercício03;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Carro {
    
    String marca, modelo;
    int ano;
    boolean ligado;
    
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
