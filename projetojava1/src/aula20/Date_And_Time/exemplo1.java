package aula20.Date_And_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class exemplo1 {

	public static void main(String[] args) {

		// Data atual
		LocalDate dt = LocalDate.now();
		System.out.println("Antes da formatação: " + dt);

		// Formatando a data para o padrão brasileiro
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String datFormatada = dt.format(dtf);
		System.out.println("Depois da formatação: " + datFormatada);

		// Data e Hora atual
		LocalDateTime dtH = LocalDateTime.now();
		System.out.println("Antes da formatação: " + dtH);
		
		// Formatando a data para o padrão brasileiro
		DateTimeFormatter dtHf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String datHoraFormatada = dtH.format(dtHf);
		System.out.println("Depois da formatação: " + datHoraFormatada);
		
		//https://www.w3schools.com/java/java_date.asp

	}

}
