package by.academy.homework5.task3;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {

	private T[][] array;
	private int str, column;

	public ArrayIterator(T[][] array) {
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		if (str < array.length && column < array[str].length) {
			return true;
		}
		return false;
	}

	@Override
	public T next() {
		T item = array[str][column++];
		if (column >= array[str].length) {
			str++;
			column = 0;
		}
		return item;
	}

}
