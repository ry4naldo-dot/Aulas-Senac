
package Aula02_Ex15_Empregado;

/**
 *
 * @author Ryan
 */
public class Main {
    
    public static void main(String[] args) {
        
        Empregado emp = new Empregado("Mana", "Gerente", 5000);
        System.out.println("Empregado: "+emp.getNome()+" | Bônus: "+emp.calcularBonus());
        
    }
    
}
