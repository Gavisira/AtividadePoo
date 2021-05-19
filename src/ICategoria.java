import java.io.IOException;
import java.util.ArrayList;

public interface ICategoria {
	
	
	public boolean VerificaAprovacao(ArrayList<Disciplina> disciplinas);
	public int CalculaCreditos(Disciplina disciplina);
	public void GerarArquivoDefinicaoCurricular (ArrayList<Disciplina> disciplinas);
	public ArrayList<Disciplina> DefinicaoCurricular (ArrayList<Disciplina> disciplinas);


}
