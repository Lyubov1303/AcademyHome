package by.academy.homework5;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<>(20);

		for (int i = 0; i < 20; i++) {

			int j = (int) (Math.random() * 10 + 1);
			marks.add(j);
		}
		System.out.println(marks);

		Iterator<Integer> iterator = marks.iterator();
		int maxMark = iterator.next();
		while (iterator.hasNext()) {
			int i = iterator.next();
			if (i > maxMark) {
				maxMark = i;
			}
		}
		System.out.print("Самая высокая оценка: " + maxMark);

	}

}

