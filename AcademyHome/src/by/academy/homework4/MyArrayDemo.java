package by.academy.homework4;

import java.util.Arrays;

public class MyArrayDemo {
	public static void main(String[] args) {

		Integer[] arrInt = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		MyArray<Integer> obj = new MyArray<>(arrInt);

		System.out.println(Arrays.toString(obj.getItems()));

		obj.add(16);
		System.out.println(Arrays.toString(obj.getItems()));

		obj.add(17);
		obj.add(18);
		obj.add(19);
		System.out.println(Arrays.toString(obj.getItems()));

		System.out.println("Элемент с индексом 7: " + obj.get(7));

		System.out.println("Первый элемент массива: " + obj.getFirst());
		System.out.println("Последний элемент массива: " + obj.getLast());

		obj.remove(19);
		System.out.println(Arrays.toString(obj.getItems()));

		obj.remove(0);
		System.out.println(Arrays.toString(obj.getItems()));

		obj.remove(Integer.valueOf(13));
		System.out.println(Arrays.toString(obj.getItems()));

	}

}
