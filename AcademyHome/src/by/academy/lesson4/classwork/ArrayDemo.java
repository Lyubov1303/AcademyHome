package by.academy.lesson4.classwork;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] values = new int[10];
		
		for (int i = 0; i < values.length; i++) {
            values[i] = new Random().nextInt(10);
            }
System.out.println(Arrays.toString(values));
Arrays.sort(values);
System.out.println(Arrays.toString(values));
}
}
