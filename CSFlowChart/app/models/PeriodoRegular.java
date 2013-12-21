package models;

import java.util.ArrayList;


public class PeriodoRegular implements Periodo {

	private ArrayList<Disciplina> disciplinas;
	
	
	public PeriodoRegular(){
		disciplinas = new ArrayList<Disciplina>();
	}
	
	
	@Override
	public int getTotalDeCreditos() {
		int total=0;
		for (Disciplina disciplina : disciplinas) {
			total +=disciplina.getCreditos();
		}
		return total;
	}

	@Override
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public void AdicionaDisciplina(Disciplina disciplina){
		disciplinas.add(disciplina);
	}
	
	public void removeDisciplina(Disciplina disciplina){
		disciplinas.remove(disciplina);
	}

}
