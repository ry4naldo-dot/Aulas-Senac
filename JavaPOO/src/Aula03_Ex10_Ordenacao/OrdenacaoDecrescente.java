
package Aula03_Ex10_Ordenacao;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author RYANGABRIELDAROSA
 */
public class OrdenacaoDecrescente implements Ordenacao{

    @Override
    public void ordenar(List lista) {
        
        Collections.sort(lista, Collections.reverseOrder());
        System.out.println("Lista ordenada em ordem decrescente: "+lista);
        
    }  
}
