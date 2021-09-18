package by.academy.lesson19.classwork;

class CallCenter {

	private int operator = 0;

	public synchronized void get() {
		while (operator < 1) {
			try {
				wait();
				System.out.println("Ждем оператора");
			} catch (InterruptedException e) {
				System.err.println(e);
			}
		}
		operator--;
		System.out.println(Thread.currentThread().getName() + "Оператор поднял трубку. Номер оператора: " + operator);
		notify();
	}

	public synchronized void put() {
		while (operator >= 5) {
			try {
				wait();
				System.out.println("Ждем место");
			} catch (InterruptedException e) {
				System.out.println(e);

			}
		}
		operator++;
		System.out
				.println(Thread.currentThread().getName() + "Оператор освободился. Номер оператора: " + operator);
		notify();
	}

}