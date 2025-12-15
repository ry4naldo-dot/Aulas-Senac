
package Aula04_Ex04_Eletrodomesticos;

import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        //Televisão
        System.out.println("Digite a marca da TV: ");
        String marcaTV = teclado.nextLine();
        System.out.println("Digite o modelo da TV: ");
        String modeloTV = teclado.nextLine();
        System.out.println("Digite o canal que esta passando: ");
        String canalTV = teclado.nextLine();
        System.out.println("Digite o volume da TV: ");
        int volTV = teclado.nextInt();         
        Televisao t1 = new Televisao(marcaTV,modeloTV,true,canalTV,volTV);
       
        //Geladeira
        System.out.println("Digite a marca da geladeira: ");
        String marcaGe = teclado.nextLine();
        System.out.println("Digite o modelo da geladeira: ");
        String modeloGe = teclado.nextLine();
        System.out.println("Digite a temperatura da geladeira: ");
        double tempGe = teclado.nextDouble();
        Geladeira g1 = new Geladeira(marcaGe,modeloGe,true,tempGe);
        
        //Microondas
        System.out.println("Digite a marca do micro-ondas: ");
        String marcaMO = teclado.nextLine();
        System.out.println("Digite o modelo do micro-ondas: ");
        String modeloMO = teclado.nextLine();
        System.out.println("Digite a potencia do micro-ondas: ");
        String potMO = teclado.nextLine();
        Microondas m1 = new Microondas(marcaMO,modeloMO,true,potMO);
        
        //Exibição
        System.out.println("Televisão: "+t1.marca+"\nModelo: "+t1.modelo+"\nLigado: "+t1.ligado+"\nCanal: "+t1.getCanal()+"\nVolume: "+t1.getVolumne());
        System.out.println("Geladeira: "+g1.marca+"\nModelo: "+g1.modelo+"\nLigado: "+g1.ligado+"\nCanal: "+g1.getTemperatura());
        System.out.println("Micro-ondas: "+m1.marca+"\nModelo: "+m1.modelo+"\nligado: "+m1.ligado+"\nPotencia: "+m1.getPotencia());
        
    }
    
}
