package by.academy.lesson13.classwork;

import java.io.Closeable;
import java.io.IOException;

public class AutoclosableTest implements Closeable {

	@Override
	public void close() throws IOException {
		System.out.println("Я закрылся!");
	}

}