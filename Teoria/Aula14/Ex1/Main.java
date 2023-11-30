package Aula14.Ex1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
        Path arq = Paths.get("professores_disciplina.txt");
		
		try {
			List<String> cont = Files.readAllLines(arq);
			Map<String,String> professores_disciplinas = new HashMap<>();
			
			cont.forEach((linha) -> {
				String[] linhaQuebrada = linha.split("=");
				professores_disciplinas.put(linhaQuebrada[0],linhaQuebrada[1]);
			});

			professores_disciplinas.forEach((professor, disciplina) -> {
				System.out.println("Professor: " + professor);
				System.out.println("Disciplina: " + disciplina);
				System.out.println("");
			});
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}