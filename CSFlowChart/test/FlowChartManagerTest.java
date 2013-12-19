import static org.junit.Assert.*;

import org.junit.Test;
import controllers.FlowChartManager;

public class FlowChartManagerTest {

	@Test
	public void DeveExibirTotalDeCreditosInicial() {
		FlowChartManager csflow = new FlowChartManager();
		assertEquals(1, csflow.getPeriodoAtual(), 0);
		assertEquals(24, csflow.getTotalDeCreditos(), 0);
	}
	
	@Test
	public void DeveRetornarDisciplinasCorretamente() {
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
		
		for(int i = 0; i < 6; i++) assertTrue(esperadas[i].equals(atuais[i]));
	}
}
