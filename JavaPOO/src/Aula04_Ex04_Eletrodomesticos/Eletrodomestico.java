
package Aula04_Ex04_Eletrodomesticos;

/**
 *Crie uma classe Eletrodoméstico com os atributos marca, modelo e ligado (booleano).
Crie subclasses Televisão, Geladeira e Micro-ondas que herdam de Eletrodoméstico e 
* adicionam seus próprios atributos e métodos específicos:
- Televisão: canal e volume
- Geladeira: temperatura
- Micro-ondas: potência
 * @author Ryan
 */
public class Eletrodomestico {
    
    protected String marca, modelo;
    protected boolean ligado;

    public Eletrodomestico(String marca, String modelo, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = ligado;
    }
}
