package by.academy.lesson19.classwork;

	class Producer implements Runnable {

		private Port port;

		public Producer(Port port) {
			this.port = port;
		}

		@Override
		public void run() {
			for (int i = 0; i < 30; i++) {
				port.accept();
			}
		}
	}


