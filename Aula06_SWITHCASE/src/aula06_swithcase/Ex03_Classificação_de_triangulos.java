
package aula06_swithcase;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ex03_Classificação_de_triangulos {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.print("Digite o lado A: ");
        double a = teclado.nextDouble();

        System.out.print("Digite o lado B: ");
        double b = teclado.nextDouble();

        System.out.print("Digite o lado C: ");
        double c = teclado.nextDouble();

        
        if (a + b > c && a + c > b && b + c > a) {
            String tipo;

            
            if (a == b && b == c) {
                tipo = "equilatero";
            } else if (a == b || b == c || a == c) {
                tipo = "isosceles";
            } else {
                tipo = "escaleno";
            }

            switch (tipo) {
                case "equilatero":
                    System.out.println("Triângulo Equilátero");
                    break;
                case "isosceles":
                    System.out.println("Triângulo Isósceles");
                    break;
                case "escaleno":
                    System.out.println("Triângulo Escaleno");
                    break;
                default:
                    System.out.println("Tipo desconhecido");
            }
            
        } else {
            
            System.out.println("Os lados digitados não formam um triângulo válido.");
            
        }
        
    }
    
}