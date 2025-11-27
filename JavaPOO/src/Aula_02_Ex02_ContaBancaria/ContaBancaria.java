
package Aula_02_Ex02_ContaBancaria;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class ContaBancaria {
    
    private String numeroConta;
    private double saldo;
    private String titular;

    public ContaBancaria(String numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    void depositar(double valor) {
        
        if(valor > 0){
            
           saldo += valor;
           System.out.println("Depósito de R$"+valor+" realizado com sucesso.\n");
            
        }else{
            
            System.out.println("Valor de depósito inválido\n");
            
        }
        
    }
    
    /*void sacar(double valor) {
        
        if(valor > 0 && valor <= saldo){
            
            saldo -= valor;
            System.out.println("Saque de R$"+valor+" relizado com sucesso.\n");
            
        }else{
            
            System.out.println("Valor de saque inválido ou saldo insuficiente.\n");
            
        }     
    }*/
    
    void obterSaldo(){
        
        System.out.println("Saldo saldo final: R$"+saldo);
        
    }
    
}
