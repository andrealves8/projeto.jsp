package aula18.collections.exemplos_praticos.ex01;

import java.util.ArrayList;
import java.util.List;

import aula10.array;

public class List_Aula_Main {

	public static void main(String[] args) {

		var a1 = new List_Aula("Java", 30);
		var a2 = new List_Aula("Banco de Dados", 35);
		var a3 = new List_Aula("JavaScript", 50);

		List<List_Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);

		for (List_Aula aula : aulas) {
			System.out.println(aula.getTitulo() + "-" + aula.getTempo());
		}
		
		

	}

}
