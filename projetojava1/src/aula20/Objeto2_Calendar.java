package aula20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Objeto2_Calendar {

	public static void main(String[] args) throws ParseException {
		Calendar calendar = Calendar.getInstance();

		System.out.println("Milisegundos: " + calendar.getTimeInMillis());

		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));

		// Formato para apresentar em tela
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(simpleDateFormat.format(Calendar.getInstance().getTime()));

		// Formato para salvar em banco de dados
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(simpleDateFormat.format(Calendar.getInstance().getTime()));

	}

}
