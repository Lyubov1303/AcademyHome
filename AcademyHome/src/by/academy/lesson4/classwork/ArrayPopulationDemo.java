package by.academy.lesson4.classwork;

import java.util.Random;

public class ArrayPopulationDemo {
	public static void main(String... args) {
		int[] array = new int[10];
		Random rand = new Random();

		for (int i = 0; i < array.length; i++) { //длина 
			array[i] = rand.nextInt(20) - 10; //рандомно выбирает число отнимает 10 10 раз (длина массива)
		}

		System.out.println("initial array:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "   ");
		}

		System.out.println();
		for (int i = 0; i < array.length; i++) {
			array[i] += 10; //теперь назад добавляет
		}
		System.out.println("new array:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "   ");
		}

	}
}