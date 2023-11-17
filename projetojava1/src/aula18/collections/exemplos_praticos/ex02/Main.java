package aula18.collections.exemplos_praticos.ex02;

public class Main {

	public static void main(String[] args) {

		var c1 = new Cliente("ANDRÉ ALVES", 1111);
		var c2 = new Cliente("WILLYAN CAETANO", 2222);
		
		var cc = new ContaCorrente(c1);
		var cp = new ContaPoupanca(c2);
		
		cc.depositar(400);
		cc.depositar(500);
		cc.sacar(200);
		cc.transferir(300, cp);

		cc.imprimirExtrato();
		cp.imprimirExtrato();


	}

}
