package by.academy.lesson17.classwork;

public class MyThreadDemo {
	public static void main(String[] args) {

		MyThread myThread = new MyThread();
		//myThread.setDaemon(true);
		//myThread.start();
		myThread.start();
		//System.out.println("hello there I  don't care about daemon");
	}
}
