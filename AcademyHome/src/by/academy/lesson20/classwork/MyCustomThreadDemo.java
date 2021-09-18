package by.academy.lesson20.classwork;



public class MyCustomThreadDemo {

	public static void main(String[] args) {

		NewThread thread = new NewThread();
//		thread.run();
		thread.start();

		Runnable runnable = new MyRunnable();
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		Thread thread3 = new Thread(runnable);
		thread1.start();
		thread2.start();
		thread3.start();
		//Thread thread21 = new Thread(() -> {
			// do something
		//});

	}

}