
package Avaliacao;

import java.util.Scanner;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);       
        int op;
       
        // Teste
        Produto pro = new Produto("Camisa","0607");
        pro.setPreco(12900);
        pro.StatusDoProduto();
        Vendedor ve = new Vendedor("Patrick","123",2000);
        
        
        do{
            
            System.out.println("1. Produto");
            System.out.println("2. Vendedor");
            System.out.println("0. Sair");
            op = teclado.nextInt();
            teclado.nextLine();
            
            switch(op){
                
                case 1: System.out.println("Digite o nome do produto: ");
                String nomeP = teclado.nextLine();
                System.out.println("Digite o código do produto: ");
                String codP = teclado.nextLine();
                System.out.println("Digite o preço do produto: ");
                double precoP = teclado.nextDouble();
                Produto p1 = new Produto(nomeP,codP);
                p1.setPreco(precoP);
                //return "Desconto de 10% aplicado."; ou return "Sem desconto disponível.";
                p1.StatusDoProduto();
                break;
                
                case 2: System.out.println("Digite o nome do Vendedor: ");
                String nomeV = teclado.nextLine();
                System.out.println("Digite o ID do vendedor: ");
                String idV = teclado.nextLine();
                System.out.println("Digite a meta do Vendedor: ");
                double metaV = teclado.nextDouble();
                Vendedor v1 = new Vendedor(nomeV,idV,metaV);
                System.out.println("Vendedor: "+v1.nome+", ID: "+v1.id+", Meta de vendas: R$"+v1.getMetaVendas());
                // return "Bônus de meta ativado para o vendedor.";
                break;
                
            }
            
        }while(op != 0);
       
    }
}
