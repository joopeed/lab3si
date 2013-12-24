package models;

import java.util.ArrayList;

public abstract class Periodo {

	ArrayList<Disciplina> disciplinas; //CREATOR: Periodo é feito de disciplinas
	
	
	public Periodo(){
		disciplinas = new ArrayList<Disciplina>();
	}
	
	public int getTotalDeCreditos(){
		int soma = 0;
		for(Disciplina disciplina: disciplinas) soma +=  disciplina.getCreditos();
		return soma;
	}
	
	public ArrayList<Disciplina> getDisciplinas() {
		//INFORMATION EXPERT: o periodo conhece suas disciplinas e pode externa-las
		return disciplinas;
	}

	public abstract void adicionaDisciplina(Disciplina disciplina) throws Exception;

	public abstract void removeDisciplina(Disciplina disciplina) throws Exception;

	public boolean exists(Disciplina disciplina) {
		//INFORMATION EXPERT: Somente o periodo pode determinar se possui uma disciplina
		return disciplinas.contains(disciplina);
	}

	public int getQuantoFaltaParaMinimo() {
		//INFORMATION EXPERT: O periodo tem a informacao para determinar quanto falta
		return hasMinimoDeCredito()? 0: 14 - getTotalDeCreditos();
	}

	public boolean hasMinimoDeCredito() {
		//INFORMATION EXPERT: O periodo tem a informacao para determinar se tem o minimo
		if (getTotalDeCreditos() >= 14){
			return true;
		} 
		return false;
	}

	public void removeDisciplinaSemRequisito(Disciplina preRequisito) throws Exception {
		for(Disciplina disciplina: disciplinas) 
			if(disciplina.getPreRequisitos().contains(preRequisito)) 
				removeDisciplina(disciplina);
		
	}
	
	
	}