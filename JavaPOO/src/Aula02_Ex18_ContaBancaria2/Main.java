
package Aula02_Ex18_ContaBancaria2;

/**
 *
 * @author Ryan
 */
public class Main {
    
    public static void main(String[] args) {
        
        ContaBancaria2 conta = new ContaBancaria2("12345", "Ryan", 1000);
        conta.sacar(300);
        System.out.println("Saldo após saque: "+conta.getSaldo());
        
    }
    
}
