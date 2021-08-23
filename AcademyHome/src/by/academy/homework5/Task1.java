package by.academy.homework5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Task1 {
	public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
		return new HashSet<>(collection);
	}

	public static void main(String[] args) {

		Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 2, 5, 7));

		collection = removeDuplicates(collection);
		System.out.println(collection.toString());
	}
}
