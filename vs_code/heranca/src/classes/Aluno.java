package classes;

public class Aluno extends Pessoa {
    private int matricula;

    public Aluno() {
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno [NOME=" + nome + ", CPF=" + cpf + ", IDADE=" + idade + ", MATRICULA=" + matricula + "]";
    }

}
