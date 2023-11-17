package aula18.collections.exemplos_praticos.ex02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Conta {
	private static final int AGENCIA = 332;
	private String numero = new GeradorDeContas().numeroGerado;
	private double saldo;
	private Cliente cliente;
	protected Movimentacao movimentacao;
	Tipo tipo;

	LocalDateTime data = LocalDateTime.now();
	DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM  HH:mm ");
	String dataAtual = data.format(dataFormatada);

	private List<Movimentacao> movimentacoes = new ArrayList<>();

	public Conta(Cliente cliente) {
		this.cliente = cliente;
	}

	public void depositar(double valor) {
		saldo += valor;
		movimentacoes.add(new Movimentacao(dataAtual, tipo.CREDITO, valor));
	}

	public void sacar(double valor) {
		saldo -= valor;
		movimentacoes.add(new Movimentacao(dataAtual, tipo.DEBITTO, valor));
	}

	public void transferir(double valor, Conta contaDestino) {
		sacar(valor);
		contaDestino.depositar(valor);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void imprimirExtrato(String nomeConta) {
		System.out.println(String.format("**** Extrato %s ****", nomeConta));
		System.out.println(String.format("CLIENTE: %s ¬ CPF: %d", cliente.getNome(), cliente.getCpf()));
		System.out.println(String.format("AGENCIA: %d ¬ CONTA: %s%n", AGENCIA, numero));
		System.out.println("|DATA   HORA   |TIPO     |VALOR");

		for (Movimentacao movimentacao : movimentacoes) {

			System.out.println(String.format("|%s |%s  |R$%.2f", movimentacao.getDataAtual(), movimentacao.getTipo(),
					movimentacao.getValor()));

		}

		System.out.println(String.format("%nSALDO DISPONÍVEL: R$%.2f%n", this.saldo));

	}

}
