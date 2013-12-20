import static org.junit.Assert.*;

import java.util.ArrayList;

import models.*;

import org.junit.Test;
import controllers.FlowChartManager;

public class FlowChartManagerTest {

	FlowChartManager csflow;
	
	@Test
	public void DeveExibirTotalDeCreditosInicial() {
		csflow = new FlowChartManager();
		assertEquals(1, csflow.getPeriodoAtual(), 0);
		assertEquals((int) 24, csflow.getTotalDeCreditos(1), 0);
	}
	
	@Test
	public void DeveRetornarDisciplinasCorretamente() {
		csflow = new FlowChartManager();
		ArrayList<Disciplina> atuais =  csflow.getDisciplinas(1); // Argumento é o período, no caso, o primeiro.
		
		ArrayList<Disciplina> preRequisitos = new ArrayList<Disciplina>(); 	
		//Vazio. Sem Pre-requisitos para as disciplinas de primeiro período
		
		ArrayList<Disciplina> esperadas = new ArrayList<Disciplina>(); 
		esperadas.add(new Disciplina("Cálculo Diferencial e Integral I", 4, preRequisitos));
		esperadas.add(new Disciplina("Álgebra Vetorial e Geometria Analítica", 4, preRequisitos));
		esperadas.add(new Disciplina("Leitura e Produção de Textos", 4, preRequisitos));
		esperadas.add(new Disciplina("Programação I", 4, preRequisitos));
		esperadas.add(new Disciplina("Introdução à Computação", 4, preRequisitos));
		esperadas.add(new Disciplina("Laboratório de Programação I", 4, preRequisitos));
		
		for(int i = 0; i < 6; i++) assertTrue(esperadas.get(i).equals(atuais.get(i)));
	}
}
