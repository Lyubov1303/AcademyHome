package by.academy.lesson19.classwork;

class Consumer implements Runnable {

	private CallCenter callcenter;

	public Consumer(CallCenter callcenter) {
		this.callcenter = callcenter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			callcenter.get();
		}
	}
}