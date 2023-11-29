package Aula12.Ex1;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List; 
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List <Double> listaDoubles = new ArrayList<Double>();
        
        for(int i = 0; i < 5; i++){
            listaDoubles.add(new Random().nextDouble()*100);
        }

        Collections.sort(listaDoubles, Collections.reverseOrder()); // Ordena a lista de forma decrescente

        for(Double d : listaDoubles){
            System.out.println(d);
        }
    }
}
