package models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class LeitorDeCatalogo {


	public static void preencheCatalogo(List<Disciplina> disciplinas) throws IOException {
		
		String caminho = new File("resources/catalogo.txt").getCanonicalPath();
		BufferedReader reader = new BufferedReader(new FileReader(new File(caminho)));

		while (reader.ready()) {
			String[] info = reader.readLine().split(" -> ");
			
			String nome = info[0];
			String creditos = info[2];
			String id = info[3];

			disciplinas.add(new Disciplina(nome, Integer.parseInt(creditos), id));
		}
		reader.close();
		preencheDependentes();
	}

	
	
	private static void preencheDependentes() {
		//FELLYPE FAZER
	}
}
