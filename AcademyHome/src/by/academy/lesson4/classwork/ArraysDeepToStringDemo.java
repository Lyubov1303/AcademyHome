package by.academy.lesson4.classwork;

import java.util.Arrays;

public class ArraysDeepToStringDemo {
	public static void main(String[] args) {
		String[][] array = { { "����-����", "����-���", "����-���" }, { "���-����", "���-���", "���-���" } };
		System.out.println(Arrays.deepToString(array));
	}
}