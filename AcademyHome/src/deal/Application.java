package deal;

public class Application {
	public static void main(String... args) {
		Deal deal = new Deal();
		User seller = new User();
		User buyer = new User();

		Product[] products = new Product[3];

		products[0] = new ProductWine("Винишко", 30, 1, "White");
		products[1] = new ProductCheese("Сыр", 45, 2, 11);
		products[2] = new ProductJuice("Сок Rio", 2, 10, "Apple", 2.0);

		deal.setBuyer(buyer);
		deal.setSeller(seller);

		deal.setProducts(products);
		
		User.dateOfBirth();
		
		deal.deadlineDate();

		deal.deal();

	}
}
