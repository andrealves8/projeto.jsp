package aula18.collections.exemplos_praticos.ex02;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		super.imprimirExtrato("Conta Corrente");
	}

}
