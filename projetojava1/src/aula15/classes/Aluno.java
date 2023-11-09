package aula15.classes;

public class Aluno extends Pessoa {
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private String disciplinas;

	public Aluno() {
	}
	

	public Aluno(String nome) {
		this.nome = nome;
		
	}
	
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public String getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String toString() {
		return "Aluno [dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplinas=" + disciplinas + ", nome=" + nome + ", idade=" + idade
				+ ", dataNascimento=" + dataNascimento + ", rg=" + rg + ", cpf=" + cpf + ", nomePai=" + nomePai
				+ ", nomeMae=" + nomeMae + "]";
	}

	

}
