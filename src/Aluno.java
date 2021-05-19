import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	public String nome;
	private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	private int creditos;
	private ICategoria categoria;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	
	
	
	public void verificaAprovacaoCurso() {
		System.out.printf("O aluno{1} foi aprovado no curso", categoria.VerificaAprovacao(disciplinas)?"":" não" );
	}
	
	public void GerarDefinicaoCurricular() {
		categoria.GerarArquivoDefinicaoCurricular(disciplinas);
	}


}
