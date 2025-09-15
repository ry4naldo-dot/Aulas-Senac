
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex02_Acessar_Elementos_por_Indice {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<Double> nds = new ArrayList<>();
        
        System.out.println("Digite 5 números decimais: ");
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Número decimal "+(i+1)+" : ");
            double n = teclado.nextDouble();
            nds.add(n);
            
        }
        
        System.out.println("O terceiro elemento da lista é: "+nds.get(2));
        
    }
    
}
