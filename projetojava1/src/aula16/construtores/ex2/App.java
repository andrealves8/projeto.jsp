package aula16.construtores.ex2;

public class App {
public static void main(String[] args) {
	
	Carro car1 = new Carro(2000, "preto");
	
	Cliente c = new Cliente("duda", car1);
	
	System.out.println(c.toString());
}
}
