package models;

import java.util.ArrayList;

public class Disciplina {
	
	private String nome;
	private int creditos;
	private ArrayList<Disciplina> preRequisitos;
	private String id;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public ArrayList<Disciplina> getPreRequisitos() {
		return preRequisitos;
	}

	public void setPreRequisitos(ArrayList<Disciplina> preRequisitos) {
		this.preRequisitos = preRequisitos;
	}

	public Disciplina(String nome, int creditos, ArrayList<Disciplina> preRequisitos, String id) {
		this.nome = nome;
		this.creditos = creditos;
		this.preRequisitos = preRequisitos;
		this.id = id;
	}
	
	@Override
	public boolean equals(Object outra) {
		if(outra instanceof Disciplina){
			return id.equals(((Disciplina) outra).getId());} else return false;
	}

}
