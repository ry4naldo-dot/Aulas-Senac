
package Aula01_Exercício06;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Main_Ex06 {
    
    public static void main(String[] args) {
        
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Perigo";
        funcionario1.salario = 1267.00;
        funcionario1.departamento = "Aviazinho";
        funcionario1.aumentarSalario(5);
        
        funcionario1.novoSalario();
        
    }
    
}
