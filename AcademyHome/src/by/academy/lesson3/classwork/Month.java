package by.academy.lesson3.classwork;

import java.util.Scanner;

public class Month {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите номер мес€ца вашего рождени€:");
		
		int i = sc.nextInt();
		
		switch (i) {
		case 1:
			System.out.println("январь");
			break;
		case 2:
			System.out.println("‘евраль");
			break;
		case 3:
			System.out.println("ћарт");
			break;
		case 4:
			System.out.println("јпрель");
			break;
		case 5:
			System.out.println("ћай");
			break;
		case 6:
			System.out.println("»юнь");	
			break;
		case 7:
			System.out.println("»юль");
			break;
		case 8:
			System.out.println("јвгуст");
			break;
		case 9:
			System.out.println("—ент€брь");
			break;
		case 10:
			System.out.println("ќкт€брь");
			break;
		case 11:
			System.out.println("Ќо€брь");
			break;
		case 12:
			System.out.println("ƒекабрь");
			break;
		default:
			System.out.println("ћес€ца с таким номером не существует");
			break;
		}
		sc.close();
	}
}
