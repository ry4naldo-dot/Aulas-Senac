
package Aula02_Ex09_Funcionario;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Funcionario {
    
    private String nome;
    private double salario;
    private String departamento;

    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    void aumentarSalario(double percentual) {
        
        salario += salario * (percentual / 100);
        
    }

   void novoSalario(){
       
       System.out.println("Nome: "+nome+" ,Salario: "+salario+" ,Departamento: "+departamento);
       
   }
    
}
