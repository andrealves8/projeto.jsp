package aula16.construtores.ex2;

public class Cliente {
	String nome = "André";
	Carro carro = new Carro(2020, "civic");
	
	public Cliente(String nome, Carro carro) {
		super();
		this.nome = nome;
		this.carro = carro;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", carro=" + carro + "]";
	}
	
	
	
	
	
	
	
}
