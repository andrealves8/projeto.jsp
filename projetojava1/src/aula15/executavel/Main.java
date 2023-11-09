package aula15.executavel;

import javax.swing.JOptionPane;

import aula15.classes.Aluno;

public class Main {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite o nome: ");

		Aluno aluno = new Aluno(nome, 30);
		aluno.setNome("Paulo");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Carlos");
		
		System.out.println(aluno);
		System.out.println(aluno2);
		
	}

}
