package by.academy.lesson20.classwork;

public class NewThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 101; i++) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("NewThread: " + i);
		}
	}
}


