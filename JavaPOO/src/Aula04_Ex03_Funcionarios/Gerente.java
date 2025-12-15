
package Aula04_Ex03_Funcionarios;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Gerente extends Funcionario{
    
    private String departamento;

    public Gerente(String nome, String cargo, double salario, String departamentop) {
        super(nome, cargo, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
