import static org.junit.Assert.*;

import java.util.ArrayList;

import models.*;

import org.junit.Before;
import org.junit.Test;
import controllers.FlowChartManager;

public class FlowChartManagerTest {

	FlowChartManager csflow;
	PrimeiroPeriodo periodo1;
	PeriodoRegular periodo2;
	
	@Before
	public void setUp(){
		csflow = new FlowChartManager();
		periodo1 = new PrimeiroPeriodo();
		periodo2 = new PeriodoRegular();
	}
	
	@Test
	public void DeveExibirTotalDeCreditosInicial() {
		
		assertEquals(1, csflow.getPeriodoAtual(), 0);
		assertEquals((int) 24, csflow.getTotalDeCreditos(1), 0);
	}
	
	@Test
	public void DeveRetornarDisciplinasCorretamente() {
		
		ArrayList<Disciplina> atuais =  csflow.getDisciplinas(1); // Argumento é o período, no caso, o primeiro.
		
		ArrayList<Disciplina> preRequisitos = new ArrayList<Disciplina>(); 	
		//Vazio. Sem Pre-requisitos para as disciplinas de primeiro período
		
		ArrayList<Disciplina> esperadas = new ArrayList<Disciplina>(); 
		esperadas.add(new Disciplina("Cálculo Diferencial e Integral I", 4, preRequisitos,"0"));
		esperadas.add(new Disciplina("Álgebra Vetorial e Geometria Analítica", 4, preRequisitos,"0"));
		esperadas.add(new Disciplina("Leitura e Produção de Textos", 4, preRequisitos,"0"));
		esperadas.add(new Disciplina("Programação I", 4, preRequisitos,"0"));
		esperadas.add(new Disciplina("Introdução à Computação", 4, preRequisitos,"0"));
		esperadas.add(new Disciplina("Laboratório de Programação I", 4, preRequisitos,"0"));
		
		for(int i = 0; i < 6; i++) assertTrue(esperadas.get(i).equals(atuais.get(i)));
	}
	
	@Test
	public void deveMostrarDisciplinasAlocadasNosDoisPrimeirosPeriodos(){
		ArrayList<Disciplina> requisito = new ArrayList<Disciplina>();
		requisito.add((new Disciplina("Programação I", 4, (new ArrayList<Disciplina>()),"0")));
		requisito.add((new Disciplina("Laboratório de Programação I", 4, (new ArrayList<Disciplina>()),"0")));
		periodo2.AdicionaDisciplina((new Disciplina("Programação II", 4,requisito,"0")));
		
		
		ArrayList<Disciplina> esperadas = new ArrayList<Disciplina>(); 
		esperadas.add((new Disciplina("Programação II", 4,requisito,"0")));
		
		
		assertEquals(esperadas, periodo2.getDisciplinas());
	}
}


