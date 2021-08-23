package by.academy.homework5;

import java.util.HashMap;

public class Task5 {
	private final static String fishText = "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Suspendisse nec massa quis eros molestie luctus.";

	public static void main(String[] args) {

		String[] str = fishText.split("");
		HashMap<Character, Integer> dictionary = new HashMap<>();

		int count = 1;
		for (int i = 0; i < fishText.length(); i++) {
			for (int j = 0; j < fishText.length(); j++) {
				if (str[i].equals(str[j])) {
					count++;
				}
			}
			dictionary.put(str[i].charAt(0), count);
			count = 0;
		}
		System.out.println(dictionary);
	}
}
