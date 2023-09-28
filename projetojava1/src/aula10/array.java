package aula10;

import javax.swing.JOptionPane;

public class array {

	public static void main(String[] args) {

		// Montado array de frutas

		String qtdFrutas = JOptionPane.showInputDialog("DIGA A QUANTIDADE DE FRUTAS!");
		String[] frutas = new String[Integer.valueOf(qtdFrutas)];

		for (int pos = 0; pos < frutas.length; pos++) {
			String nomeFrutas = JOptionPane.showInputDialog("DIGA O NOME DE UMA FRUTA!");
			frutas[pos] = nomeFrutas;
		}

		for (int pos = 0; pos < frutas.length; pos++) {
			System.out.println(frutas[pos]);
		}
	}
}
