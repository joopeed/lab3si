package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Catalogo;
import models.Disciplina;
import models.Periodo;
import models.PeriodoRegular;
import models.PrimeiroPeriodo;

public class FlowChartManager {


	private ArrayList<Periodo> periodos;
	Catalogo catalogo;
	
	public FlowChartManager() {
		
		catalogo = new Catalogo();
		
		//INICIALIZANDO O FLOWCHART
		periodos = new ArrayList<Periodo>(); // CREATOR
		PrimeiroPeriodo primeiroPeriodo = new PrimeiroPeriodo();
		periodos.add(primeiroPeriodo);

	}


	public int getTotalDeCreditos(int periodo) {
		return periodos.get(periodo - 1).getTotalDeCreditos(); //INFORMATION EXPERT
	}

	public ArrayList<Disciplina> getDisciplinas(int periodo) {
		return periodos.get(periodo - 1).getDisciplinas(); //INFORMATION EXPERT
	}

	public ArrayList<Disciplina> getDisciplinasDisponiveis(){
		ArrayList<Disciplina> disciplinasDisponiveis = new ArrayList<Disciplina>();
	
		for (Disciplina disciplina : catalogo.getDisciplinas()) {
			if (!getDisciplinasAlocadas().contains(disciplina)){
				disciplinasDisponiveis.add(disciplina);
			}
		}
		return disciplinasDisponiveis;
		
	}


	private ArrayList<Disciplina> getDisciplinasAlocadas() {
		ArrayList<Disciplina> disciplinasAlocadas = new ArrayList<Disciplina>();
		for (Periodo periodo : periodos ) {
			for (Disciplina disciplina : periodo.getDisciplinas()) {
				disciplinasAlocadas.add(disciplina);
		}
	}
		return disciplinasAlocadas;
	}
	
	public void adicionaPeriodo(PeriodoRegular periodo){
		periodos.add(periodo);
	}
	
	public boolean verificaMinimoDeCreditosDoPeriodoAtual(int periodo){
		if (periodos.get(periodo).getTotalDeCreditos()<14){
			return false;
		} 
		return true;
	}
}
