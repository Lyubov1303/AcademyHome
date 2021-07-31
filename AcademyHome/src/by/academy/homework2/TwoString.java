package by.academy.homework2;

import java.util.Scanner;

public class TwoString {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Введите первую строку: ");
		String String1 = scan.nextLine();
		
		System.out.println("Введите вторую строку: ");
		String String2 = scan.nextLine();
		
		System.out.println(compare(String1, String2));
		
		scan.close();
	}
		public static boolean compare(String String1, String String2) {
			if (String1.length() !=String2.length()) {
				return false;
			}

			int count = 0;
			for (int i = 0; i < String1.length(); i++) {
				count ^= String1.charAt(i) ^ String2.charAt(i);
			}
			return count == 0;

			}

	}
//честно списала это гениальное решение))), но я подробно изучила ход решения
//при побитовом сравнении символов подсчитывается количество несовпадений при помощи оператора XOR, если количество равно = 0, то символы в строках совпадают