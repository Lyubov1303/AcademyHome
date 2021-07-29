package by.academy.lesson8.classwork;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateBirthday {
	public static void main(String[] args) {

		LocalDate birthday = LocalDate.of(1989, 3, 13);
		LocalDate today = LocalDate.now();

		int year = birthday.getYear();
		int month = birthday.getMonthValue();
		Month monthAsEnum = birthday.getMonth(); // как перечисление
		int dayYear = birthday.getDayOfYear();
		int dayMonth = birthday.getDayOfMonth();
		DayOfWeek dayWeekEnum = birthday.getDayOfWeek(); // как перечисление

		System.out.println("Год: " + year);
		System.out.println("Месяц: " + month);
		System.out.println("Название месяца: " + monthAsEnum);
		System.out.println("День в году: " + dayYear);
		System.out.println("День месяца: " + dayMonth);
		System.out.println("День недели: " + dayWeekEnum);
		System.out.println("День недели(number): " + dayWeekEnum.getValue());
		System.out.println("birthday.isAfter(today)? " + birthday.isAfter(today)); 
        System.out.println("birthday.isBefore(today)? " + birthday.isBefore(today));
        System.out.println("birthday.equals(today)? " + birthday.equals(today));
}
}