package by.academy.lesson19.classwork;

class Producer implements Runnable {

	private CallCenter callcenter;

	public Producer(CallCenter callcenter) {
		this.callcenter = callcenter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			callcenter.put();
		}
	}
}