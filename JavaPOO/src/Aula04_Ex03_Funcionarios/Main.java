
package Aula04_Ex03_Funcionarios;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        //Gerente
        System.out.println("Digite o nome do gerente: ");
        String nomeGe = teclado.nextLine();
        System.out.println("Digite o cargo do gerente: ");
        String cargoGe = teclado.nextLine();
        System.out.println("Digite o salario do gerente: ");
        double salGe = teclado.nextDouble();
        System.out.println("Departamento do gerente: ");
        String departGe = teclado.nextLine();
        Gerente g1 = new Gerente(nomeGe,cargoGe,salGe,departGe);
        
        //Vendedor
        System.out.println("Digite o nome do gerente: ");
        String nomeVe = teclado.nextLine();
        System.out.println("Digite o cargo do gerente: ");
        String cargoVe = teclado.nextLine();
        System.out.println("Digite o salario do gerente: ");
        double salVe = teclado.nextDouble();
        System.out.println("Departamento do gerente: ");
        String comissaoVe = teclado.nextLine();
        Vendedor v1 = new Vendedor(nomeVe,cargoVe,salVe,comissaoVe);
        
        //Desenvolvedor
        System.out.println("Digite o nome do gerente: ");
        String nomeDe = teclado.nextLine();
        System.out.println("Digite o cargo do gerente: ");
        String cargoDe = teclado.nextLine();
        System.out.println("Digite o salario do gerente: ");
        double salDe = teclado.nextDouble();
        System.out.println("Departamento do gerente: ");
        String linguagem = teclado.nextLine();
        Desenvolvedor d1 = new Desenvolvedor(nomeDe,cargoDe,salDe,linguagem);
        
        //Exibição
        System.out.println("Gerente: "+g1.nome+"\nCargo: "+g1.cargo+"\nSalario: "+g1.salario+"\nDepartamento: "+g1.getDepartamento());
        System.out.println("Vendedor: "+v1.nome+"\nCargo: "+v1.cargo+"\nSalario: "+v1.salario+"\nComissão: "+v1.getComissao());
        System.out.println("Desenvolvedor: "+d1.nome+"\nCargo: "+d1.cargo+"\nSalario: "+d1.salario+"\nLinguagem de Programação: "+d1.getLinguagemdeProgramacao());
        
    }
    
}
