package models;
import java.util.ArrayList;

public class Catalogo  {
	private ArrayList<Disciplina> disciplinas;
	private ArrayList<Disciplina> requisitosP2;
	private ArrayList<Disciplina> requisitosLP2;
	private ArrayList<Disciplina> requisitosGrafos;
	private ArrayList<Disciplina> requisitosCalc2;
	private ArrayList<Disciplina> requisitosFisClassica;
	private ArrayList<Disciplina> requisitosEda;
	private ArrayList<Disciplina> requisitosLeda;
	private ArrayList<Disciplina> requisitosLinear;
	private ArrayList<Disciplina> requisitosProb;
	private ArrayList<Disciplina> requisitosTc;
	private ArrayList<Disciplina> requisitosModerna;
	private ArrayList<Disciplina> requisitosME;
	private ArrayList<Disciplina> requisitosLogica;
	private ArrayList<Disciplina> requisitosSI;
	private ArrayList<Disciplina> requisitosES;
	private ArrayList<Disciplina> requisitosPLP;
	private ArrayList<Disciplina> requisitosOAC;
	private ArrayList<Disciplina> requisitosLOAC;
	private ArrayList<Disciplina> requisitosAtal;
	private ArrayList<Disciplina> requisitosCOMP;
	private ArrayList<Disciplina> requisitosRedes;
	private ArrayList<Disciplina> requisitosSI2;
	private ArrayList<Disciplina> requisitosLES;
	private ArrayList<Disciplina> requisitosBDI;

	public Catalogo() {
		 ArrayList<Disciplina> preRequisitos = new ArrayList<Disciplina>(); 

		disciplinas.add(new Disciplina("Cálculo Diferencial e Integral II", 4, requisitosCalc2, "1"));
		disciplinas.add(new Disciplina("Matemática Discreta", 4, new ArrayList<Disciplina>(), "2"));
		disciplinas.add(new Disciplina("Fundamentos de Física Clássica", 4, requisitosFisClassica, "3"));
		disciplinas.add(new Disciplina("Programação II", 4, requisitosP2, "4"));
		disciplinas.add(new Disciplina("Teoria dos Grafos", 2, requisitosGrafos, "5"));
		disciplinas.add(new Disciplina("Laboratório de Programação II", 4, requisitosLP2, "6"));
		
		disciplinas.add(new Disciplina("Álgebra Linear", 4, requisitosLinear, "7"));
		disciplinas.add(new Disciplina("Probabilidade e Estatística", 4, requisitosProb, "8"));
		disciplinas.add(new Disciplina("Fundamentos de Física Moderna", 4, requisitosModerna, "9"));
		disciplinas.add(new Disciplina("Estruturas de Dados e Algoritmos", 4, requisitosEda, "10"));
		disciplinas.add(new Disciplina("Teoria da Computação", 2, requisitosTc, "11"));
		disciplinas.add(new Disciplina("Laboratório de Estruturas de Dados e Algoritmos", 4, requisitosLeda, "12"));
		disciplinas.add(new Disciplina("Gerência da Informação", 4, new ArrayList<Disciplina>(), "13"));
		
		disciplinas.add(new Disciplina("Métodos Estatísticos", 4, requisitosME, "14"));
		disciplinas.add(new Disciplina("Lógica Matemática", 4, requisitosLogica, "15"));
		disciplinas.add(new Disciplina("Engenharia de Software I", 4, requisitosES, "16"));
		disciplinas.add(new Disciplina("Sistemas de Informação I", 4, requisitosSI, "17"));
		disciplinas.add(new Disciplina("Paradigmas de Linguagens de Programação", 2, requisitosPLP, "18"));
		disciplinas.add(new Disciplina("Organização e Arquitetura de Computadores I", 4, requisitosOAC, "19"));
		disciplinas.add(new Disciplina("Laboratório de Organização e Arquitetura de Computadores", 4, requisitosLOAC, "20"));
		
		disciplinas.add(new Disciplina("Informática e Sociedade", 2, new ArrayList<Disciplina>(), "21"));
		disciplinas.add(new Disciplina("Análise e Técnicas de Algoritmos", 4, requisitosAtal, "22"));
		disciplinas.add(new Disciplina("Compiladores", 4, requisitosCOMP, "23"));
		disciplinas.add(new Disciplina("Redes de Computadores", 4, requisitosRedes, "24"));
		disciplinas.add(new Disciplina("Bancos de Dados I", 4, requisitosBDI, "25"));
		disciplinas.add(new Disciplina("Sistemas de Informação II", 4, requisitosSI2, "26"));
		disciplinas.add(new Disciplina("Laboratório de Engenharia de Software", 2, requisitosLES, "27"));
		
		disciplinas.add(new Disciplina("Optativa 1", 4, new ArrayList<Disciplina>(), "28"));
		disciplinas.add(new Disciplina("Optativa 2", 4, new ArrayList<Disciplina>(), "29"));
		disciplinas.add(new Disciplina("Optativa 3", 4, new ArrayList<Disciplina>(), "30"));
		disciplinas.add(new Disciplina("Optativa 4", 4, new ArrayList<Disciplina>(), "31"));
		disciplinas.add(new Disciplina("Optativa 5", 4, new ArrayList<Disciplina>(), "32"));
		disciplinas.add(new Disciplina("Optativa 6", 4, new ArrayList<Disciplina>(), "33"));
		disciplinas.add(new Disciplina("Optativa 7", 4, new ArrayList<Disciplina>(), "34"));
		disciplinas.add(new Disciplina("Optativa 8", 4, new ArrayList<Disciplina>(), "35"));
		disciplinas.add(new Disciplina("Optativa 9", 4, new ArrayList<Disciplina>(), "36"));
		disciplinas.add(new Disciplina("Optativa 10", 4, new ArrayList<Disciplina>(), "37"));
		disciplinas.add(new Disciplina("Optativa 11", 2, new ArrayList<Disciplina>(), "38"));
		
		disciplinas.add(new Disciplina("TECC(TECNOLOGIAS DE COMUNICACAO SEM FIO)", 4, new ArrayList<Disciplina>(), "39"));
		disciplinas.add(new Disciplina("TECC(MINERAÇÃO DE DADOS)", 2, new ArrayList<Disciplina>(), "40"));
		disciplinas.add(new Disciplina("TECC(JOGOS DIGITAIS)", 4, new ArrayList<Disciplina>(), "41"));
		disciplinas.add(new Disciplina("TECC(ALGORITMOS AVANÇADOS I )", 4, new ArrayList<Disciplina>(), "42"));
		disciplinas.add(new Disciplina("TECC(INTRODUÇÃO À COMPUTAÇÃO QUÂNTICA)", 4, new ArrayList<Disciplina>(), "43"));
		disciplinas.add(new Disciplina("TECC (ANÁLISE DE DADOS I)", 4, new ArrayList<Disciplina>(), "44"));
		
	}
	
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
}
