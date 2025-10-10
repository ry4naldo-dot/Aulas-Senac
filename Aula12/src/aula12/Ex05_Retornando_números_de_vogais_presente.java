
package aula12;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex05_Retornando_números_de_vogais_presente {
    
    public static int contarVogais(String texto) {
        
        int contador = 0;
        texto = texto.toLowerCase();

        for (char c : texto.toCharArray()) {
            
            if ("aeiou".indexOf(c) != -1) {
                
                contador++;
                
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma frase ou palavra: ");
        String texto = teclado.nextLine();

        int totalVogais = contarVogais(texto);
        System.out.println("Número de vogais: " + totalVogais);
        
    }
   
}
