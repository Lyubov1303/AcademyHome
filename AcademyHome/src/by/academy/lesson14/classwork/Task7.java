package by.academy.lesson14.classwork;

import java.util.function.Function;

public class Task7 {

		public static void main(String[] args) {

			Function<Integer, String> func = n -> {

				Integer i = n.compareTo(0);

				switch (i) {
				case -1:
					return "Число отрицательное";
				case 1:
					return "Число положительное";
				case 0:
					return "Ноль";
				}

				return "";
			};

			System.out.println(func.apply(-1));
			System.out.println(func.apply(10));
			System.out.println(func.apply(0));
			System.out.println(func.apply(-12));
			}

	}

