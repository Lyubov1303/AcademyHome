package by.academy.homework3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Введите дату в формате dd/MM/yyyy или dd-MM-yyyy:");
		String date = scan.nextLine();

		Pattern pattern = Pattern.compile("\\d{2}(/|-)\\d{2}(/|-)\\d{4}");
		Matcher matcher = pattern.matcher(date);

		if (matcher.matches()) {
			DateTimeFormatter formatter1 = DateTimeFormatter
					.ofPattern("dd/MM/yyyy");
			//String formattedDate = date.format(formatter1); //(как привести формат dd-MM-yyyy в dd/MM/yyyy?) 
			LocalDate formattedDate = LocalDate.parse(date, formatter1);
			int year = formattedDate.getYear();
			int month = formattedDate.getMonthValue();
			int day = formattedDate.getDayOfMonth();

			System.out.println("День: " + "<" + day + ">");
			System.out.println("Месяц: " + "<" + month + ">");
			System.out.println("Год: " + "<" + year + ">");

		} else {
			System.out.println("Дата введена неверно");
		}

		scan.close();

	}
}