package by.academy.homework2;

import java.util.Scanner;

public class MinWord {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Введите количество слов:");
		int quantity = scan.nextInt();
		
		String[] wordArray = new String[quantity];

		for (int i = 0; i < wordArray.length; i++) {
			System.out.println("Введите слово:");
			wordArray[i] = scan.next();
		}
		
		String minWord = wordArray[0];

		for (int j = 1; j < wordArray.length; j++) {
			if (wordArray[j].length() < minWord.length()) {
				minWord = wordArray[j];
			}
		}

		System.out.println("Слово \"" + minWord + "\" является первым с минимальным количеством символов");
		scan.close();
	}

}