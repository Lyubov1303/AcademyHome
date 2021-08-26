package by.academy.lesson14.classwork;

import java.util.function.Predicate;

public class PredicateDemo1 {
		public static void main(String[] args) {

			Predicate<String> strNull = str -> str != null && !str.trim().isEmpty();
			
			System.out.println(strNull.test("пепе"));
			System.out.println(strNull.test(""));
			System.out.println(strNull.test(null));
		}

		public static boolean test(String str) {
			return str != null && !str.trim().isEmpty();
		}
	}


