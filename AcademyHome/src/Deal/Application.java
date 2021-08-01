package by.academy.lesson7.classwork;

public class Application {
	public static void main(String... args) {
		Deal deal = new Deal();
		User seller = new User();
		User buyer = new User();

		Product[] products = new Product[3];

		products[0] = new ProductWine("Винишко", 30, 1, "White");
		products[1] = new ProductCheese("Сыр", 45, 2, 11);
		products[2] = new ProductCheese("Сыр", 5, 20, 1);

		deal.setBuyer(buyer);
		deal.setSeller(seller);

		deal.setProducts(products);

		System.out.println("Bill:");
		for (Product p : deal.getProducts()) {
			System.out.println(p.getName() + " price: " + p.calcPrice());
		}
		System.out.println("-------------");
		System.out.println("Full price: " + deal.calcFullPrice());

	}
}
