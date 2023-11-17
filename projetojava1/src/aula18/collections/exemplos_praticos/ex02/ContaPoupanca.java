package aula18.collections.exemplos_praticos.ex02;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		super.imprimirExtrato("Conta Poupança");
	}

}
