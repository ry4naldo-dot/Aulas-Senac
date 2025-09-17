
import java.util.Scanner;


/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex01Fácil_soma_dos_elementos {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int soma = 0;
        int cont = 0;
        System.out.println("Digite quandos números você deseja: ");
        int quantidade = teclado.nextInt();
        
        int[] quant = new int [quantidade];
        
        for (int i : quant) {
            
            cont++;
            System.out.println("Número "+cont+" : ");
            int num = teclado.nextInt();
            
            soma += num;
            
        }
          
        System.out.println("A soma dos números é: "+soma);
        
    }
    
}
