package by.academy.homework5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task2 {
	public static Random random = new Random();

	public static <T> void compare2Lists(List<Integer> list) {

		final int N = 1_000_000;
		final int M = 100_000;
		for (int i = 0; i < N; i++) {
			list.add((int) Math.random());

		}
		long time = System.currentTimeMillis();
		for (int i = 0; i < M; i++) {
			list.get((int) (Math.random() * (N - 1)));
		}
		System.out.println(System.currentTimeMillis() - time);

	}

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();

		System.out.print("Время выборки из ArrayList: ");
		compare2Lists(arrayList);

		List<Integer> linkedList = new LinkedList<>();
		System.out.print("Время выборки из LinkedList: ");
		compare2Lists(linkedList);

	}
}
/*
 * время выборки по индексу из LinkedList значительно превышает время выборки из
 * ArrayList, т.к. ArrayList - это список, реализованный на основе массива, а
 * LinkedList — это классический связный список, основанный на объектах с
 * ссылками между ними, ввиду чего при необходимости регулярной вставки или
 * удалении из середины спискапредпочтительней использовать LinkedList
 */
