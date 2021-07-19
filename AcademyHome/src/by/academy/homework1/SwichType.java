package by.academy.homework1;

import java.util.Scanner;
public class SwichType {

	public static void main(String[] args) {
		System.out.println("¬ведите тип переменной: ");
		Scanner scanner = new Scanner(System.in);
		String t = scanner.nextLine();
		System.out.println("¬ведите переменную: ");
		int x = scanner.nextInt();

		switch (t) {
		case ("int"):
			System.out.println(x % 2);
			break;
		case ("double"):
			System.out.println(x * 0.7);
			break;
		case ("float"):
			System.out.println(x * x);
			break;
		case ("char"):
			System.out.println((char) x);
			break;
		case ("String"):
			System.out.println("Hello " + x);
			break;
		default:
			System.out.println("Unsupported type");
		}
		scanner.close();
	}

}