
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex03_Verificar_Contem {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<String> cores = new ArrayList<>();
        
        cores.add("Vermelho");
        cores.add("Verde");
        cores.add("Azul");
        
        boolean contemAmarelo = cores.contains("Amarelo");
        System.out.println("A lista contém a cor amarela? "+contemAmarelo);
        
        for(String cor : cores) {
            
            System.out.println(cor);
            
        }
        
    }
    
}