package models;


public class PeriodoRegular extends Periodo {

	
	@Override
	public void adicionaDisciplina(Disciplina disciplina) throws Exception {
		disciplinas.add(disciplina);
		
	}
	
	@Override
	public void removeDisciplina(Disciplina disciplina) throws Exception {
		disciplinas.remove(disciplina);
	}

}
