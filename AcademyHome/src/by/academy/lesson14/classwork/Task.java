package by.academy.lesson14.classwork;

import java.util.function.Predicate;

public class Task {
	public static void main(String[] args) {

		Predicate<String> strNull = str -> str != null;;
		Predicate<String> str1 = str -> !str.isEmpty();
		
		System.out.println(strNull.and(str1).test(""));
		System.out.println(strNull.and(str1).test(null));
		System.out.println(strNull.and(str1).test("rtmnkfj"));
	}
}

