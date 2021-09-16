package by.academy.lesson19.classwork;

	public class ProducerConsumerDemo {

		public static void main(String[] args) {

			Port port = new Port();
			Producer producer1 = new Producer(port);
			Producer producer2 = new Producer(port);

			Consumer consumer1 = new Consumer(port);
			Consumer consumer2 = new Consumer(port);
			Consumer consumer3 = new Consumer(port);
			Consumer consumer4 = new Consumer(port);

			new Thread(consumer1, "Consumer 1").start();
			new Thread(consumer2, "Consumer 2").start();
			new Thread(consumer3, "Consumer 3").start();
			new Thread(consumer4, "Consumer 4").start();
			new Thread(producer1, "Producer 1").start();
			new Thread(producer2, "Producer 2").start();

		}
	}
