package models;

import java.util.ArrayList;

public class PrimeiroPeriodo implements Periodo {
	
	
	ArrayList<Disciplina> disciplinas;

	public PrimeiroPeriodo() {
		disciplinas = new ArrayList<Disciplina>(); //CREATOR
		
		ArrayList<Disciplina> preRequisitos = new ArrayList<Disciplina>(); 	//TODO: CREATOR INCORRETO 
		//Vazio. Sem Pre-requisitos para as disciplinas de primeiro período
		
		disciplinas.add(new Disciplina("Cálculo Diferencial e Integral I", 4, preRequisitos,"41"));
		disciplinas.add(new Disciplina("Álgebra Vetorial e Geometria Analítica", 4, preRequisitos,"42"));
		disciplinas.add(new Disciplina("Leitura e Produção de Textos", 4, preRequisitos,"0"));
		disciplinas.add(new Disciplina("Programação I", 4, preRequisitos,"39"));
		disciplinas.add(new Disciplina("Introdução à Computação", 4, preRequisitos,"41"));
		disciplinas.add(new Disciplina("Laboratório de Programação I", 4, preRequisitos,"40"));
	}

	public int getTotalDeCreditos() {
		int soma = 0;
		for(Disciplina disciplina: disciplinas) soma +=  disciplina.getCreditos();
		return soma;
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

}
