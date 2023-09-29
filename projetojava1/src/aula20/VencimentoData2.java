package aula20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class VencimentoData2 {

	public static void main(String[] args) throws ParseException {
		Calendar calendar = Calendar.getInstance();

		// Pegando data atual com getTime() e atribuindo em calendar com setTime()
		calendar.setTime(calendar.getTime());
		// Somando data atual + 30 dias
		calendar.add(Calendar.DAY_OF_MONTH, 30);

		System.out.println("------------------**DATA DE VENCIMENTO**-------------------");
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));

	}

}
