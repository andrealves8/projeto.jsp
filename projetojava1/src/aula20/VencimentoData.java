package aula20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class VencimentoData {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		String dtAtual = simpleDateFormat.format(date);
		Date dataAtual = simpleDateFormat.parse(dtAtual);

		Date dataVencimento = simpleDateFormat.parse("02/12/2023");
		String dtVencimento = simpleDateFormat.format(dataVencimento);

		// Verificar prazo do boleto
		if (dataVencimento.after(dataAtual)) {
			System.out.println("BOLETO DENTRO DO PRAZO DE PAGAMENTO!");
		} else {
			System.out.println("BOLETO VENCIDO!!!");
		}

		System.out.println("------------------------------------------");
		System.out.println("DATA ATUAL: " + dtAtual);
		System.out.println("DATA VENCIMENTO: " + dtVencimento);

	}
}
