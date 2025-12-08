
package Aula03_Ex01_ContaCorrente;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Main {
    
    public static void main(String[] args) {
        
        ContaCorrente conta1 = new ContaCorrente("667",2210.67,"Mana");
        conta1.depositar(1000);
        
        System.out.println("\nInformações da Pessoa: ");
        System.out.println("Nome: "+conta1.getNumeroConta());
        System.out.println("Idade: "+conta1.getSaldo());
        System.out.println("Altura: "+conta1.getTitular());
        
        conta1.obterSaldo();
        
        System.out.println("\nInformações da Pessoa: ");
        System.out.println("Nome: "+conta1.getNumeroConta());
        System.out.println("Idade: "+conta1.getSaldo());
        System.out.println("Altura: "+conta1.getTitular());
        conta1.sacar(500);
        
        conta1.obterSaldo();
        
    }
    
}
