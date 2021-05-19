
public class Disciplina {
	
	public String nomeDisciplina;
	private double notaAluno;
	private boolean aprovado = false;
	private final double horasAulaMateria;
	public  final int idDisciplina;
	
	public Disciplina(String nome,double horas,int id) {
		nomeDisciplina = nome;
		horasAulaMateria = horas;
		idDisciplina = id;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public double getNotaAluno() {
		return notaAluno;
	}

	public void setNotaAluno(double notaAluno) {
		this.notaAluno = notaAluno;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

	public double getHorasAulaMateria() {
		return horasAulaMateria;
	}
	
	
	

	
	
}
