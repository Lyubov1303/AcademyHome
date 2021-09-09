package by.academy.lesson17.classwork;

public class MyRunnable implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			if (i % 10 == 0)
				System.out.println("Run by " + Thread.currentThread().getName() + ", i is " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
}