package by.academy.lesson14.classwork;

import java.util.function.Consumer;

import deal.Product;
import deal.ProductCheese;

public class Task3 {
	public static void main(String[] args) {

		ProductCheese c = new ProductCheese("Сыр", 45, 2, 11);
		Consumer<Product> cons1 = product -> System.out.println("Отгрузили " + product.getName());

		Consumer<Product> cons2 = product -> System.out.println("Отправили " + product.getName());
		Consumer<Product> cons3 = System.out::println;
		cons1.andThen(cons2).accept(c);
		cons3.accept(c);

	}
}