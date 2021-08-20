package by.academy.homework5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Main {
	public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
		return new HashSet<>(collection);
	}

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
//Задача 1.
		Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 2, 5, 7));

		collection = removeDuplicates(collection);
		System.out.println(collection.toString());

//Задача 2.
		List<Integer> arrayList = new ArrayList<>();

		System.out.print("Время выборки из ArrayList: ");
		compare2Lists(arrayList);

		// List<Integer> linkedList = new LinkedList<>();
		// System.out.print("Время выборки из LinkedList: ");
		// compare2Lists(linkedList);

//Задача 3.
		Integer[][] array = { { 1, 2 }, { 1, 2, null }, { 1, null, 3, 4 }, { 1, 2, 3, 4, 5 }, {} };
		Integer[][] array1 = {};
		ArrayIterator<Integer> iterator = new ArrayIterator<>(array);
		ArrayIterator<Integer> iterator1 = new ArrayIterator<>(array1);
		System.out.println(iterator.hasNext());
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");

		}
		System.out.println("");
		System.out.println(iterator1.hasNext());

		while (iterator1.hasNext()) {
			System.out.print(iterator1.next() + " ");
		}
		
		
	}
}