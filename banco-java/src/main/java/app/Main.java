package app;
import classes.Cliente;
import classes.ContaCorrente;
import classes.ContaPoupanca;

public class Main {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("ANDRÉ ALVES", 1111);
		Cliente c2 = new Cliente("WILLYAN CAETANO", 2222);
		
		ContaCorrente cc = new ContaCorrente(c1);
		ContaPoupanca cp = new ContaPoupanca(c2);
		
		cc.depositar(400);
		cc.depositar(500);
		cc.sacar(200);
		cc.transferir(300, cp);

		cc.imprimirExtrato();
		cp.imprimirExtrato();


	}

}
