
package Aula01_Exercício06;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Funcionario {
    
    String nome;
    double salario;
    String departamento;

//    public Funcionario(String nome, double salario, String departamento) {
//        this.nome = nome;
//        this.salario = salario;
//        this.departamento = departamento;
//    }

    void aumentarSalario(double percentual) {
        
        salario += salario * (percentual / 100);
        
    }

   void novoSalario(){
       
       System.out.println("Nome: "+nome+" ,Salario: "+salario+" ,Departamento: "+departamento);
       
   }
    
}
