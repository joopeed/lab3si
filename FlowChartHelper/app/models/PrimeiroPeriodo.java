package models;

import java.util.ArrayList;
import java.util.List;

public class PrimeiroPeriodo extends Periodo {
	
	public PrimeiroPeriodo(List<Disciplina> iniciais) {
		disciplinas.addAll(iniciais);
	}


	public PrimeiroPeriodo() {
		
	}


	@Override
	public void adicionaDisciplina(Disciplina disciplina) throws Exception {
		throw new NaoPodeAdicionarDisciplinaException(); //PERIODO IMUTAVEL
	}
	@Override
	public void removeDisciplina(Disciplina disciplina) throws Exception {
		throw new NaoPodeRemoverDisciplinaException(); //PERIODO IMUTAVEL
	}


	
}
