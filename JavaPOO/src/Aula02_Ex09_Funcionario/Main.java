
package Aula02_Ex09_Funcionario;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Main {
    
    public static void main(String[] args) {
        
        Funcionario funcionario1 = new Funcionario("Perigo",1267.00,"Aviozinho");
        //funcionario1.nome = "Perigo";
        //funcionario1.salario = 1267.00;
        //funcionario1.departamento = "Aviazinho";
        funcionario1.aumentarSalario(5);
        
        funcionario1.novoSalario();
        
    }
    
}
