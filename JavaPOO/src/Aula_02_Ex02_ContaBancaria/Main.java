
package Aula_02_Ex02_ContaBancaria;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Main {
    
    public static void main(String[] args) {
            
        ContaBancaria conta1 = new ContaBancaria("669",1650.67,"Jorge");
        conta1.depositar(1000);
        
        System.out.println("\nInformações da Pessoa: ");
        System.out.println("Nome: "+conta1.getNumeroConta());
        System.out.println("Idade: "+conta1.getSaldo());
        System.out.println("Altura: "+conta1.getTitular());
        
        conta1.obterSaldo();
        
    }
    
}
