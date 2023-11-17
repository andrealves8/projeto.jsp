package aula18.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Collections_All {

	public static void main(String[] args) {

		System.out.println("---------- ArrayList ---------- ");

		ArrayList<String> list = new ArrayList<String>();

		list.add("valor");
		list.add(0, "valor");
		list.get(0);
		list.set(0, "troca valor");
		list.size(); // Tamanho do array
		list.remove(0); // remove o índice
		list.clear(); // limpa a lista inteira

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(1);
		numbers.add(4);
		numbers.add(2);
		System.out.println(numbers);

		Collections.sort(numbers); // Ordena a lista de números
		System.out.println(numbers);

		// Fonte: https://www.w3schools.com/java/java_arraylist.asp

		System.out.println("---------- LinkedList ---------- ");

		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("Honda");

		cars.addFirst("valor"); // Adds an item to the beginning of the list.
		cars.addLast("valor"); // Add an item to the end of the list
		cars.removeFirst(); // Remove an item from the beginning of the list.
		cars.removeLast(); // Remove an item from the end of the list
		cars.getFirst(); // Get the item at the beginning of the list
		cars.getLast(); // Get the item at the end of the list

		// Fonte: https://www.w3schools.com/java/java_linkedlist.asp

		System.out.println("---------- HashMap ---------- ");

		HashMap<String, String> capitalCities = new HashMap<String, String>();

		// Add keys and values (Country, City)
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities);

		capitalCities.get("England"); // O método consulta sua chave
		capitalCities.remove("England");
		capitalCities.clear();
		capitalCities.size();

		/*
		 * Faça um loop pelos itens de a HashMapcom um loop for-each . Nota: Use o
		 * keySet()método se quiser apenas as chaves e use o values()método se quiser
		 * apenas os valores:
		 */

		// Print keys
		for (String i : capitalCities.keySet()) {
			System.out.println(i);
		}

		// Print values
		for (String i : capitalCities.values()) {
			System.out.println(i);
		}

		// Print keys and values
		for (String i : capitalCities.keySet()) {
			System.out.println("key: " + i + " value: " + capitalCities.get(i));
		}

		// Fonte: https://www.w3schools.com/java/java_hashmap.asp

		System.out.println("---------- HashSet ---------- ");

		HashSet<String> cars2 = new HashSet<String>();
		cars2.add("Volvo");
		cars2.add("BMW");
		cars2.add("Ford");
		cars2.add("BMW");
		cars2.add("Mazda");
		System.out.println(cars2);

		cars.contains("Mazda");
		cars.remove("Volvo");
		cars.clear();
		cars.size();

		for (String i : cars) {
			System.out.println(i);
		}

	}

}
