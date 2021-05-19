import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class PosGraduacao implements ICategoria {

	public String nome;
	public List<Disciplina> curriculo = new ArrayList<Disciplina>();
	public int creditosNecessarios = 20;
	
	
	public PosGraduacao() {}
	
	public PosGraduacao(String nome) {
		this.nome = nome;
	}
	
	public PosGraduacao(String nome, ArrayList<Disciplina> disciplinas) {
		this.nome = nome;
		curriculo = disciplinas;
	}
	
	public void AdicionarDisciplinasADefinicao(Disciplina nova) {
		curriculo.add(nova);
	}
	
	@Override
	public boolean VerificaAprovacao(ArrayList<Disciplina> disciplinas) {
		int creditos = 0;
		for(Disciplina p : disciplinas) {
			for(Disciplina c:curriculo) {
			if(p.isAprovado()&&(p.idDisciplina==c.idDisciplina))creditos += CalculaCreditos(p);
		}
			}
		return creditos>=creditosNecessarios?true:false;
	}

	
	
	@Override
	public int CalculaCreditos(Disciplina disciplina) {
		return (int)disciplina.getHorasAulaMateria()/120;
	}


	public ArrayList<Disciplina> DefinicaoCurricular(ArrayList<Disciplina> disciplinas) {
		ArrayList<Disciplina> nova = new ArrayList<Disciplina>();
		for(Disciplina d:disciplinas) {
			for(Disciplina c:curriculo) {
				if(d.isAprovado()&&d.idDisciplina==c.idDisciplina) {
					nova.add(d);
				}
			}
		}
		return nova;
		
	}
	@Override
	public void GerarArquivoDefinicaoCurricular(ArrayList<Disciplina> disciplinas) {
		FileWriter arq;
		try {
			arq = new FileWriter("definicao.txt");
			PrintWriter gravarArq = new PrintWriter(arq);
		    int creditos=0;
		    
		    
		    for(Disciplina d:DefinicaoCurricular(disciplinas)) {
		    	
		    	gravarArq.println(d.nomeDisciplina + "  " + d.getNotaAluno());
		    	creditos+=CalculaCreditos(d);
		    }
		    	gravarArq.println("Creditos Restantes: " + (creditosNecessarios-creditos));
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
