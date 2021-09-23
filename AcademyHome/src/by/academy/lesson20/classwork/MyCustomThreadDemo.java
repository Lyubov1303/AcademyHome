package by.academy.lesson20.classwork;



public class MyCustomThreadDemo {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("a");

		NewThread t1 = new NewThread(sb);
		NewThread t2 = new NewThread(sb);
		NewThread t3 = new NewThread(sb);

		t1.start();
		t2.start();
		t3.start();
	}
}