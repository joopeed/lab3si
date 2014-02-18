package models;
 
import java.io.IOException;
import java.util.ArrayList;

/**
 * Classe responsável pela criação do catálogo de disciplinas do curso
 * @author Ana Luiza, Fellype e João Pedro
 *
 */
 public class Catalogo {
 
    private ArrayList<Disciplina> disciplinas;
    
	public Catalogo() throws IOException{
		  disciplinas = new ArrayList<Disciplina>();
		  LeitorDeCatalogo.preencheCatalogo(disciplinas);
          
	}

 
	public ArrayList<Disciplina>  getDisciplinas(){
		return disciplinas;
 
	}

	public Disciplina get(String id) {
	     for(Disciplina disciplina: disciplinas) if(disciplina.getId().equals(id)) return disciplina;
	     return null;
	}
 
}
