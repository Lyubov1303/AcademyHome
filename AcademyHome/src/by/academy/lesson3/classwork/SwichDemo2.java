package by.academy.lesson3.classwork;

public class SwichDemo2 {
			public static void main(String... args) {

			String s = "StR";

			String s1 = s.toLowerCase();
			//ПреобРАЗОВАние РЕГистРА

			switch (s1) {
			case "s":
				System.out.println("число равно 1");
				break;
			case "st":
				System.out.println("число равно 2");
				break;
			case "str":
				System.out.println("число равно 3");
				break;
			case "stri":
				System.out.println("число равно 4");
				break;
			default:
				System.out.println("default");
				break;
			}
		}
	}

