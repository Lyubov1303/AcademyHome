package by.academy.lesson3.classwork;

import java.io.IOException;

public class SystemInDemo {
	public static void main(String[] args) throws IOException {
		int x = System.in.read();
		char c = (char) x;
		System.out.println("��� �������: " + c + " = " + x);
	}
}