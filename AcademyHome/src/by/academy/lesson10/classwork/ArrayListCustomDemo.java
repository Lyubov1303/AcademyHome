package by.academy.lesson10.classwork;

import java.util.Arrays;

public class ArrayListCustomDemo {
	public static void main(String[] args) {
		Integer[] arrInt = { 1, 2, 3 };
		ArrayListCustom<Integer> obj = new ArrayListCustom<>(arrInt);
		System.out.println(Arrays.toString(obj.getItems()));
		obj.add(4);
		System.out.println(Arrays.toString(obj.getItems()));
		obj.add(5);
		obj.add(6);
		obj.add(7);
		System.out.println(Arrays.toString(obj.getItems()));
		obj.remove(6);
		System.out.println(Arrays.toString(obj.getItems()));
		obj.remove(3);
		System.out.println(Arrays.toString(obj.getItems()));
		obj.remove(3);
	}

}
