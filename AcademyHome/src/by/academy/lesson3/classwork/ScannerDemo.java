package by.academy.lesson3.classwork;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		
		Scanner Wr = new Scanner(System.in);

		System.out.println("Enter your name: ");
		String name = Wr.nextLine();
		
		System.out.println("Enter your gender:  ");
		char gender = Wr.next().charAt(0);

		System.out.println("How old are you? ");
		int age = Wr.nextInt();

		System.out.println("Enter your mobile number:  ");
		long mobileNo = Wr.nextLong();

		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("Mobile Number: " + mobileNo);
		
		Wr.close();
	}
}