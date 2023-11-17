package aula12;

public class A1 {
	C1 c1;
	double saldo;

	public A1(C1 c1) {
		super();
		this.c1 = c1;
	}

	void depositar(double valor) {
		this.saldo += valor;
	}

	void sacar(double valor) {
		this.saldo -= valor;
	}

	void transferir(double valor, A2 a2) {
		this.sacar(valor);
		a2.depositar(valor);
	}

	public C1 getC1() {
		return c1;
	}

	public void setA2(C1 c1) {
		this.c1 = c1;
	}

	public double getSalario() {
		return saldo;
	}

	public void setSalario(double salario) {
		this.saldo = salario;
	}

	void imprimir() {
		System.out.println(this.c1.getNome());
		System.out.println(this.c1.getIdade());
		System.out.println(String.format("%.2f", this.saldo));
	}

}
