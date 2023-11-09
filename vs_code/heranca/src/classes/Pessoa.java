package classes;

public class Pessoa {
    protected String nome;
    protected int cpf;
    protected int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String idadeMin(String nome) {
        if (idade > 20) {
            return nome;
        }
        return "NENHUM ALUNO POSSUI A IDADE MÍNIMA";
    }

}
