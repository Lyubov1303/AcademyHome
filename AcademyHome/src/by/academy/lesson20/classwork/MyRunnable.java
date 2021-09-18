package by.academy.lesson20.classwork;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 101; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (i%10==0)
			System.out.println("RunnableCounter: " + i);
//			MultithreadingDemo.incrementCounter();
		}
	}

}