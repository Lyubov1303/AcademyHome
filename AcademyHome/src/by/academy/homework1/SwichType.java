package by.academy.homework1;

import java.util.Scanner;
public class SwichType {

	public static void main(String[] args) {
		System.out.println("������� ��� ����������: ");
		Scanner scanner = new Scanner(System.in);
		String t = scanner.nextLine();
		System.out.println("������� ����������: ");
		//int x = scanner.nextInt();

		switch (t) {
		case ("int"):
			int a = scanner.nextInt();
			System.out.println(a % 2);
			break;
		case ("double"):
			double b = scanner.nextDouble();
			System.out.println(b * 0.7);
			break;
		case ("float"):
			float c = scanner.nextFloat();
			System.out.println(c * c);
			break;
		case ("char"):
			char d =  (char) scanner.nextInt();
			System.out.println((char) d);
			break;
		case ("String"):
			String e = scanner.next();
			System.out.println("Hello " + e);
			break;
		default:
			System.out.println("Unsupported type");
		}
		scanner.close();
	}

}