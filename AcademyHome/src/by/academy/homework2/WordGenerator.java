package by.academy.homework2;

import java.util.Scanner;

public class WordGenerator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Введите 2 слова с чётным количеством символов через пробел:");
		String words[] = scan.nextLine().split(" ");

		while (words.length != 2 || words[0].length() % 2 != 0 || words[1].length() % 2 != 0) {
				System.out.println("Необходимо ввести 2 слова с чётным количеством символов через пробел. Повторите ввод:");
				words = scan.nextLine().split(" ");
			}

			StringBuilder newWord = new StringBuilder();
			newWord.append(words[0].substring(0, words[0].length() / 2))
					.append(words[1].substring(words[1].length() / 2, words[1].length()));

			System.out.println("Новое слово: \"" + newWord + "\"");
			scan.close();
		}

	}