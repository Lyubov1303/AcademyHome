package by.academy.homework4;

import java.util.Arrays;

public class MyArray<T> {
	private T[] items;
	private int size;

	@SuppressWarnings("unchecked")
	public MyArray() {
		super();
		items = (T[]) new Object[16];
	}

	@SuppressWarnings("unchecked")
	public MyArray(int initCap) {
		super();
		items = (T[]) new Object[initCap];
	}

	public MyArray(T[] items) {
		super();
		this.items = items;
		size = items.length;
	}

	private void growth() {
		T[] temp = Arrays.copyOf(items, items.length * 2 + 1);
		items = temp;
	}

	public void add(T item) {
		if (size >= items.length) {
			growth();
		}
		items[size++] = item;
	}

	public T get(int i) {
		if (i >= size || i < 0) {
			System.out.println("Выход за предел массива");
			return null;
		} else {
			return items[i];
		}
	}

	public T getFirst() {
		if (items[0].equals(null)) {
			System.out.println("В массиве нет элементов");
			return null;
		}
		return (T) items[0];
	}

	public T getLast() {
		if (items[size - 1].equals(null)) {
			System.out.println("В массиве нет элементов");
			return null;
		}
		return (T) items[size - 1];
	}

	public void arrayLength() {
		System.out.println("Количество элементов в массиве: " + items.length);
	}

	public void lastIndex() {
		System.out.println("Индекс последнего заполненого элемента: " + (size - 1));
	}

	public void remove(int i) {
		if (i >= size || i < 0) {
			System.out.println("Попытка удаления пустого элемента");
			return;
		}

		if (i < size) {
			System.arraycopy(items, i + 1, items, i, size - i - 1);
		}
		items[--size] = null;
	}

	public void remove(T obj) {
		for (int i = 0; i < size - 1; i++) {
			if (items[i].equals(obj)) {
				System.arraycopy(items, i + 1, items, i, size - i - 1);
				items[--size] = null;
			}
		}
		System.out.println("Такого объекта нет");
	}

	public T[] getItems() {
		return items;
	}

}
