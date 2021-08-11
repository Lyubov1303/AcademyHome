package by.academy.homework4;

public class MyIteratorDemo {

	public static void main(String[] args) {

		Integer[] arrInt = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

		MyIterator<Integer> iterator = new MyIterator<>(arrInt);

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}