package models;

import java.io.IOException;
import java.util.ArrayList;


public class Plano {

	
	private Catalogo catalogo;
	private ArrayList<Periodo> periodos;
	
	public Plano() throws IOException {
		catalogo = new Catalogo(); //CREATOR: o Manager é quem mais usa o Catalogo
		periodos = new ArrayList<Periodo>(); // CREATOR: o Manager é feito de periodos
	}
	
	
	public int getTotalDeCreditos(int periodo) {
		//INFORMATION EXPERT: O periodo deve responder isso, ele possui disciplinas
		return periodos.get(periodo - 1).getTotalDeCreditos(); 
	}
	
	
	public ArrayList<Disciplina> getDisciplinas(int periodo) {
		//INFORMATION EXPERT: O periodo deve responder isso, ele possui disciplinas
		return periodos.get(periodo - 1).getDisciplinas(); 
	}
	
	public int getTotalDePeriodos(){ return periodos.size(); } 
	

	public int getCreditos(int periodo) {
		return periodos.get(periodo -1).getTotalDeCreditos();
	}
	
	public void adicionaPeriodo(){
		//CREATOR: O Manager é feito de disciplinas e as usa.
		if(getTotalDePeriodos() > 0)
			periodos.add(new PeriodoRegular());
		else 
			periodos.add(new PrimeiroPeriodo());
	}
	
	public void adicionaDisciplina(String id, int periodo) throws Exception {
		Disciplina aAdicionar = catalogo.get(id);
		if(verificaPreRequisitos(aAdicionar, periodo)) 
			periodos.get(periodo - 1).adicionaDisciplina(aAdicionar);
		else throw new FaltaPreRequisitoException();
	}
	
	public void removeDisciplina(String id, int periodo) throws Exception {
		Disciplina aRemover = catalogo.get(id);
		periodos.get(periodo - 1).removeDisciplina(aRemover);
		removePreRequisitos(aRemover, periodo);
	}
	public boolean verificaMinimoDeCreditosDoPeriodo(int periodo){
		//INFORMATION EXPERT: O Manager é o unico que conhece todos os periodos
		return !periodos.get(periodo - 1).hasMinimoDeCredito();
	}
	
	public int verificaQuantosCreditosFaltaNoPeriodo(int periodo){
		//INFORMATION EXPERT: O Manager é o unico que conhece todos os periodos
		return periodos.get(periodo - 1).getQuantoFaltaParaMinimo();
			
	}
	public boolean verificaPreRequisitos(Disciplina disciplina, int periodo){
		//INFORMATION EXPERT: O Manager é o unico que conhece todos os periodos
		boolean resu = true;
		for(Disciplina preRequisito: disciplina.getPreRequisitos())
			if(!jaExisteNosPeriodosAnteriores(preRequisito,periodo)) return false;
		return disciplina.getPreRequisitos().size() == 0? true: resu;
	}
	public boolean jaExisteNosPeriodosAnteriores(Disciplina disciplina, int periodo){
		//INFORMATION EXPERT: O Manager é o unico que conhece todos os periodos
		for(int i = 0; i < periodo -1; i++){
			if(periodos.get(i).exists(disciplina)) return true;
		}
		return false;
	}
	public void removePreRequisitos(Disciplina disciplina, int periodo) throws Exception {
		ArrayList<Disciplina> removidas = new ArrayList<Disciplina>();
		for(int i = periodo -1 ; i < periodos.size(); i++){
			removidas.addAll(periodos.get(i).removeDisciplinaSemRequisito(disciplina));
		}
		for(Disciplina removida: removidas) removePreRequisitos(removida, periodo);
	}
	public ArrayList<Disciplina> getDisciplinasDisponiveis(){
		//INFORMATION EXPERT: O Manager é o unico que o catalogo e as alocadas ao mesmo tempo
		ArrayList<Disciplina> disciplinasDisponiveis = new ArrayList<Disciplina>();
 
		for (Disciplina disciplina : catalogo.getDisciplinas()) {
			if (!getDisciplinasAlocadas().contains(disciplina)){
				disciplinasDisponiveis.add(disciplina);
			}
		}
		return disciplinasDisponiveis;
 
	}

	/**
	 * Recupera a lista de disciplinas que já foram alocadas 
	 * @return lista de disciplinas alocadas
	 */
	private ArrayList<Disciplina> getDisciplinasAlocadas() {
		//INFORMATION EXPERT: O Manager é o unico que conhece todos os periodos
		ArrayList<Disciplina> disciplinasAlocadas = new ArrayList<Disciplina>();
		for (Periodo periodo : periodos ) {
			for (Disciplina disciplina : periodo.getDisciplinas()) {
				disciplinasAlocadas.add(disciplina);
		}
	}
		return disciplinasAlocadas;
	}
}
