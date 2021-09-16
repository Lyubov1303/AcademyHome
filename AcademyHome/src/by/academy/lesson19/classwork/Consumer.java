package by.academy.lesson19.classwork;

class Consumer implements Runnable {

	private Port port;

	public Consumer(Port port) {
		this.port = port;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			port.decrease();
		}
	}
}