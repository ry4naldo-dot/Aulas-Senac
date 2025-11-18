
package Aula01_Exercício02;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Main_Ex02 {
    
    public static void main(String[] args) {
        
        ContaBancaria conta1 = new ContaBancaria();
        conta1.numeroConta = "67";
        conta1.saldo = 20.93;
        conta1.titular = "João Xman";
        conta1.depositar(1000);
        conta1.sacar(100);
        
        conta1.obterSaldo();
        
    }
    
}
