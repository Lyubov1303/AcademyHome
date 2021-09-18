package by.academy.lesson19.classwork;

public class ProducerConsumerDemo {

	public static void main(String[] args) {

		CallCenter callcenter = new CallCenter();
		Producer producer1 = new Producer(callcenter);
		Producer producer2 = new Producer(callcenter);

		Consumer consumer1 = new Consumer(callcenter);
		Consumer consumer2 = new Consumer(callcenter);
		Consumer consumer3 = new Consumer(callcenter);
		Consumer consumer4 = new Consumer(callcenter);

		new Thread(consumer1, "Consumer 1 ").start();
		new Thread(consumer2, "Consumer 2 ").start();
		new Thread(consumer3, "Consumer 3 ").start();
		new Thread(consumer4, "Consumer 4 ").start();
		new Thread(producer1, "Producer 1 ").start();
		new Thread(producer2, "Producer 2 ").start();

	}
}