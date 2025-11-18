
package Aula01_Exercícios08;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Aluno {
    
    String nome;
    int matricula;
    double[]notas;
    
    double calcularMedia(){ // double[]{7.5,8.0,6.0,9.5};
        
        if(notas.length == 0){
            
            return 0.0; // Protege o restante do método contra tentativa de 
                        //dividir por zero, garantindo que o método sempre retorne 
                        //um valor válido
            
        }
        
        double soma = 0;
        for(double nota : notas){
            
            soma += nota;
            
        }
        
        return soma / notas.length;
        
    }
    
}
