
package Aula03_Ex10_Ordenacao;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class OrdenacaoCrescente implements Ordenacao{

    @Override
    public void ordenar(List lista) {
        
        Collections.sort(lista);
        System.out.println("Lista ordenada em ordem crescente: "+lista);       
    }    
}
