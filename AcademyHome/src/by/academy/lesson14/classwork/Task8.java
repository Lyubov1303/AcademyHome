package by.academy.lesson14.classwork;

import java.util.Random;
import java.util.function.Supplier;

public class Task8 {
	
	public static void main(String[] args) {

		

		Supplier<Integer> randomInt = () -> new Random().nextInt(10);

		System.out.println(randomInt.get());
	}
}
