package aula12;

public class A2 {
	C1 c1;
	double saldo;
	
	public A2(C1 c1) {
		super();
		this.c1 = c1;
	}
	
	void depositar(double valor) {
		saldo += valor;
	}

	public C1 getC1() {
		return c1;
	}

	public void setC1(C1 c1) {
		this.c1 = c1;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	void imprimir() {
		System.out.println(this.c1.getNome());
		System.out.println(this.c1.getIdade());
		System.out.println(String.format("%.2f", this.saldo));
	}
	
	
	
}
