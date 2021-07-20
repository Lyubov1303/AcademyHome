package by.academy.lesson1.classwork;

public class Application {
	public static void main(String... args) {

		System.out.println("Hello cats");
		Cat cat1 = new Cat();
		Cat cat2 = new Cat("Sima");

		cat2.eat();
		cat2.sleep();
		cat2.walk();

		cat1.grow(3);
		cat1.Age();
	}

}
