package Deal;

import java.util.Date;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Deal {
	private Product[] products;
	private User seller;
	private User buyer;
	private Date dealDate;

	public Deal() {
		super();
	}

	public Deal(Product[] products, User seller, User buyer, Date dealDate) {
		super();
		this.products = products;
		this.seller = seller;
		this.buyer = buyer;
		this.dealDate = dealDate;
	}

	public double calcFullPrice() {
		double fullPrice = 0;
		if (products != null) {
			for (Product p : products) {
				fullPrice += p.calcPrice();
			}
		}
		return fullPrice;
	}

	public void deadlineDate() {
		LocalDate today = LocalDate.now();
		LocalDate deadlineDate = today.plusDays(10);
		System.out.println("\t");
		System.out.println("Today:                " + today);
		System.out.println("\t");
		System.out.println("Deadline Date:        " + deadlineDate);
	}

	public void deal() {

		System.out.println("\t");
		System.out.println("            Bill:            ");
		System.out.println("------------------------");
		for (Product p : getProducts()) {
			System.out.println(p.getName() + "  price: " + p.calcPrice());
		}
		System.out.println("------------------------");
		System.out.println("Full price: " + calcFullPrice());

	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public Date getDealDate() {
		return dealDate;
	}

	public void setDealDate(Date dealDate) {
		this.dealDate = dealDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(products);
		result = prime * result + Objects.hash(buyer, dealDate, seller);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deal other = (Deal) obj;
		return Objects.equals(buyer, other.buyer) && Objects.equals(dealDate, other.dealDate)
				&& Arrays.equals(products, other.products) && Objects.equals(seller, other.seller);
	}

	@Override
	public String toString() {
		return "Deal [products=" + Arrays.toString(products) + ", seller=" + seller + ", buyer=" + buyer + ", dealDate="
				+ dealDate + "]";
	}

}
