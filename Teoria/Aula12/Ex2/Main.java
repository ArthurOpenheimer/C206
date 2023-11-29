package Aula12.Ex2;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List; 

public class Main {
    
    public static void main(String[] args) {

        List<Tipo> tipos = new ArrayList<Tipo>();

        tipos.add(new TipoUm("TipoUm2", 2));
        tipos.add(new TipoUm("TipoUm1", 1));
        tipos.add(new TipoDois("TipoDois2", 4));
        tipos.add(new TipoDois("TipoDois1", 3));
        tipos.add(new TipoTres("TipoTres2", 6));
        tipos.add(new TipoTres("TipoTres1", 5));

        Collections.sort(tipos);

        for(Tipo t : tipos) {
            t.doSomething();
        }
    }
}
