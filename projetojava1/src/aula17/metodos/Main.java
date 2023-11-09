package aula17.metodos;

public class Main {

	public static void main(String[] args) {
		
		// Chamada método de classe diretamente.
		int res1 = calc1(2, 3);
		System.out.println(res1);
		
		Calculadora c = new Calculadora();
		int res2 = c.calc2(2, 10);
		System.out.println(res2);
		
		// num1 acessado diretamente como atributo de classe
		// num1 não precisa ser instaciado, pois usa a palavra static
		System.out.println(num1);

	}

	// Método de classe. Uso do static. Sem necessidade de instanciar
	static int calc1(int a, int b) {
		return a + b;
	}
	
	// Atributo de classe, uso do static
	static int num1 = 10;

}
