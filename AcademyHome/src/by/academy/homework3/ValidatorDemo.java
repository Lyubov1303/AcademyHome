package by.academy.homework3;

import java.util.Scanner;

public class ValidatorDemo {

	private static final AmericanPhoneValidator americanPhoneValidator = new AmericanPhoneValidator();
	private static final BelarusPhoneValidator belarusPhoneValidator = new BelarusPhoneValidator();
	private static final EmailValidator emailValidator = new EmailValidator();
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Введите американский или белорусский номер телефона:");
		String phoneNumber = scan.nextLine();
		
		if (americanPhoneValidator.validate(phoneNumber)||belarusPhoneValidator.validate(phoneNumber)) {
			System.out.println("На номер " +phoneNumber + " будет приходить рассылка");
		} else {
			System.out.println("На данный номер рассылка невозможна");
		}
		
		System.out.println("\t");
		System.out.println("Введите свой email:");
		
		String email = scan.nextLine();

		if (emailValidator.validate(email)) {
			System.out.println("Дополнительная информация будет отправлена на ваш email");
		} else {
			System.out.println("Вы указали email некорректно");
		}
		scan.close();
	}
}