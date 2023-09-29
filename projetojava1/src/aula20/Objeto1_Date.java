package aula20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Objeto1_Date {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();

		System.out.println(date);
		System.out.println("Milisegundos: " + date.getTime());

		// formato para mostrar na tela
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(simpleDateFormat.format(date));

		// formato para salvar em banco de dados
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(simpleDateFormat.format(date));

	}

}
