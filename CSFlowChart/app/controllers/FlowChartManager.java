package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Disciplina;
import models.PrimeiroPeriodo;

public class FlowChartManager {

	private int periodoAtual;
	private ArrayList<PrimeiroPeriodo> periodos;

	public FlowChartManager() {
		periodoAtual = 1;
		
		
		//INICIALIZANDO O FLOWCHART
		periodos = new ArrayList<PrimeiroPeriodo>(); // CREATOR
		PrimeiroPeriodo primeiroPeriodo = new PrimeiroPeriodo();
		periodos.add(primeiroPeriodo);
	}

	public int getPeriodoAtual() {
		return periodoAtual;
	}

	public int getTotalDeCreditos(int periodo) {
		return periodos.get(periodo - 1).getTotalDeCreditos(); //INFORMATION EXPERT
	}

	public ArrayList<Disciplina> getDisciplinas(int periodo) {
		return periodos.get(periodo - 1).getDisciplinas(); //INFORMATION EXPERT
	}


}
