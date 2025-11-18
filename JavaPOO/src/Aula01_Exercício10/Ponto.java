
package Aula01_Exercício10;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Ponto {
    
    int x,y;
    
    double calcularDistancia(Ponto outroPonto) { //Objeto passado como parâmetro
        
        int deltaX = x - outroPonto.x;
        int deltaY = y - outroPonto.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        
    }
    
    
}
