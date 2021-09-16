package by.academy.lesson19.classwork;

public class Port {
	
	private int ship = 0;

	public synchronized void decrease() {
		while (ship < 1) {
			try {
				wait();
				System.out.println("Ждем корабль");
			} catch (InterruptedException e) {
				System.err.println(e);
			}
		}
		ship--;
		System.out.println(Thread.currentThread().getName() + "Consumer sent 1 ship. Number of ships: " + ship);
		notify();
	}

	public synchronized void accept() {
		while (ship >= 8) {
			try {
				wait();
				System.out.println("Ждем место");
			} catch (InterruptedException e) {
				System.out.println(e);

			}
		}
		ship++;
		System.out
				.println(Thread.currentThread().getName() + "Producer accepted 1 ship. Number of ships: " + ship);
		notify();
	}

}


