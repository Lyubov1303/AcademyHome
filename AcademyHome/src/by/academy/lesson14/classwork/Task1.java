package by.academy.lesson14.classwork;

	import java.util.function.Predicate;

	public class Task1 {
//		5.	Написать программу, которая проверяет, что строка начинается буквой “J”или “N” и заканчивается 
//		“A”. Используем функциональный интерфейс Predicate.
		public static void main(String[] args) {
			
			Predicate<String> chekJ = s -> s.startsWith("J");
			Predicate<String> chekN = s -> s.startsWith("N");
			Predicate<String> chekA = s -> s.endsWith("A");

			Predicate<String> chekAll = s -> (s.startsWith("J") || s.startsWith("N")) && s.endsWith("A");

			System.out.println(chekAll.test("JavA"));
			System.out.println(chekAll.test("nava"));
			System.out.println(chekAll.test("NavA"));

			System.out.println(chekJ.or(chekN).and(chekA).test("JavA"));
			System.out.println(chekJ.or(chekN).and(chekA).test("nava"));
			System.out.println(chekJ.or(chekN).and(chekA).test("NavA"));

		}

	}


