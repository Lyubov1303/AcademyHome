package by.academy.homework5.task3;

public class Task3 {
	public static void main(String[] args) {

		Integer[][] array1 = { { 1, 2 }, { 1, 2, null }, { 1, null, 3, 4 }, { 1, 2, 3, 4, 5 }, {} };
		Integer[][] array2 = {};

		ArrayIterator<Integer> iterator1 = new ArrayIterator<>(array1);
		ArrayIterator<Integer> iterator2 = new ArrayIterator<>(array2);
		System.out.println(iterator1.hasNext());

		while (iterator1.hasNext()) {
			System.out.print(iterator1.next() + " ");

		}
		System.out.println("");
		System.out.println(iterator2.hasNext());

		while (iterator2.hasNext()) {
			System.out.print(iterator2.next() + " ");
		}
	}
}
