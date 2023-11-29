package Aula12.Ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		int numValores = 100000;
		long tempoInicial, tempoFinal;
		
		List<Integer> listaInteiro = new ArrayList<Integer>();
		Set<Integer> conjuntoInteiro = new HashSet<Integer>();
		Map<Integer, Integer> mapaInteiro = new HashMap<Integer, Integer>();
		
		tempoInicial = System.currentTimeMillis();

		for (int i = 0; i < numValores; i++) {
			listaInteiro.add(i);
		}
		tempoFinal = System.currentTimeMillis();

		System.out.println("Tempo para inserir na List: " + (tempoFinal-tempoInicial)+"ms");
		
		tempoInicial = System.currentTimeMillis();

		for (int i = 0; i < numValores; i++) {
			conjuntoInteiro.add(i);
		}

		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo para inserir no Set: " + (tempoFinal-tempoInicial)+"ms");
		
		tempoInicial = System.currentTimeMillis();

		for (int i = 0; i < numValores; i++) {
			mapaInteiro.put(i, i);
		}

		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo para inserir no Map: " + (tempoFinal-tempoInicial)+"ms");
		
		tempoInicial = System.currentTimeMillis();

		for (int i = 0; i < numValores; i++) {
			listaInteiro.contains(i);
		}

		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo para buscar na List: " + (tempoFinal-tempoInicial)+"ms");

		tempoInicial = System.currentTimeMillis();
		
        for (int i = 0; i < numValores; i++) {
			conjuntoInteiro.contains(i);
		}

		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo para buscar no Set: " + (tempoFinal-tempoInicial)+"ms");

		tempoInicial = System.currentTimeMillis();
		
        for (int i = 0; i < numValores; i++) {
			mapaInteiro.containsKey(i);
		}

		tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo para buscar no Map: " + (tempoFinal-tempoInicial)+"ms");
	}
}