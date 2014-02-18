package models;

import java.util.ArrayList;

public class PrimeiroPeriodo extends Periodo {
	
	public PrimeiroPeriodo() {
		disciplinas.add(new Disciplina("Cálculo Diferencial e Integral I", 4, "0"));
		disciplinas.add(new Disciplina("Álgebra Vetorial e Geometria Analítica", 4, "1"));
		disciplinas.add(new Disciplina("Leitura e Produção de Textos", 4, "2"));
		disciplinas.add(new Disciplina("Programação I", 4, "3"));
		disciplinas.add(new Disciplina("Introdução à Computação", 4, "4"));
		disciplinas.add(new Disciplina("Laboratório de Programação I", 4, "5"));
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
