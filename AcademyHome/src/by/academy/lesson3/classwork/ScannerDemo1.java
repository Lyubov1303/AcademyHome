package by.academy.lesson3.classwork;

import java.util.Scanner;

public class ScannerDemo1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������� ����� �����: ");
		if (scanner.hasNextInt()) {
			int i = scanner.nextInt();
			System.out.println(i);
		} else {
			System.out.println("�� ����� ������� �����");
		}
		scanner.close();
	}
}