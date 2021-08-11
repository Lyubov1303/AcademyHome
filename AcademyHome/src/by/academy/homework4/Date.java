package by.academy.homework4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Date {

	private Year year;
	private Month month;
	private Day day;
	private LocalDate date;
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	private DayOfWeek dayWeekEnum;

	public Date() {
		super();
		year = new Year();
		month = new Month();
		day = new Day();

	}

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public DateTimeFormatter getFormatter() {
		return formatter;
	}

	public void setFormatter(DateTimeFormatter formatter) {
		this.formatter = formatter;
	}

	public DayOfWeek getDayWeekEnum() {
		return dayWeekEnum;
	}

	public void setDayWeekEnum(DayOfWeek dayWeekEnum) {
		this.dayWeekEnum = dayWeekEnum;
	}

	public class Year {
		private int year;
		boolean isLeapYear;

		public Year() {
			super();
		}

		public Year(int year) {
			super();
			this.year = year;
		}

		public Year(int year, boolean isLeapYear) {
			super();
			this.year = year;
			this.isLeapYear = isLeapYear;
		}

		public boolean isLeapYear() {
			if (year % 400 == 0)
				System.out.println(getYear() + " is leap year");
			else if (year % 100 == 0)
				System.out.println(getYear() + " is NOT leap year");
			else if (year % 4 == 0)
				System.out.println(getYear() + " is leap year");
			else
				System.out.println(getYear() + " is NOT leap year");
			return isLeapYear;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public int getYear() {
			return year;
		}
	}

	public class Month {
		private int month;

		public Month() {
			super();
		}

		public Month(int month) {
			super();
			this.month = month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		public int getMonth() {
			return month;
		}
	}

	public class Day {
		private int day;

		public Day() {
			super();
		}

		public Day(int day) {
			super();
			this.day = day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		public int getDay() {
			return day;
		}
	}

	public void firstDate() {
		LocalDate firstDate = LocalDate.now();
		day = new Day(firstDate.getDayOfMonth());
		month = new Month(firstDate.getMonthValue());
		year = new Year(firstDate.getYear());
		dayWeekEnum = firstDate.getDayOfWeek();
		System.out.println(firstDate);
		System.out.println(dayWeekEnum.getValue() + " по счету день недели");

	}

	public void SecondDate() {
		LocalDate secondDate = LocalDate.of(year.getYear(), month.getMonth(), day.getDay());
		// secondDate = LocalDate.parse(secondDate, formatter);
		day = new Day(secondDate.getDayOfMonth());
		month = new Month(secondDate.getMonthValue());
		year = new Year(secondDate.getYear());
		dayWeekEnum = secondDate.getDayOfWeek();
		System.out.println(secondDate);
		System.out.println(dayWeekEnum.getValue());
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, day, dayWeekEnum, formatter, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return Objects.equals(date, other.date) && Objects.equals(day, other.day) && dayWeekEnum == other.dayWeekEnum
				&& Objects.equals(formatter, other.formatter) && Objects.equals(month, other.month)
				&& Objects.equals(year, other.year);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Date [year=");
		builder.append(year);
		builder.append(", month=");
		builder.append(month);
		builder.append(", day=");
		builder.append(day);
		builder.append(", date=");
		builder.append(date);
		builder.append(", formatter=");
		builder.append(formatter);
		builder.append(", dayWeekEnum=");
		builder.append(dayWeekEnum);
		builder.append("]");
		return builder.toString();

	}

}
