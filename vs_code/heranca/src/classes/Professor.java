package classes;

public class Professor extends Pessoa {
    private String curso;

    public Professor(String nome, int cpf, String curso, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.curso = curso;
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Professor [curso=" + curso + ", nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + "]";
    }

}
