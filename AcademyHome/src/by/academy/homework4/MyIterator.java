package by.academy.homework4;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
	private T[] items;
	private int i;

	public MyIterator() {
		super();
	}

	public MyIterator(T[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (items == null || items.length <= i) {
			return false;
		}
		return items[i] != null;
	}

	@Override
	public T next() {
		return items[i++];
	}

}