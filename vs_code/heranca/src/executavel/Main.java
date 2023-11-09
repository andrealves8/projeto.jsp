package executavel;

import javax.swing.JOptionPane;
import classes.Aluno;

public class Main {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("DIGITE O NOME");
        String cpf = JOptionPane.showInputDialog("DIGITE O CPF");
        String idade = JOptionPane.showInputDialog("DIGITE A IDADE");
        String matricula = JOptionPane.showInputDialog("DIGITE O NÚMERO DA MATRICULA");

        var aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setCpf(Integer.valueOf(cpf));
        aluno.setIdade(Integer.valueOf(idade));
        aluno.setMatricula(Integer.valueOf(matricula));

        System.out.println(aluno.idadeMin(nome));

    }
}
