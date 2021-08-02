package Deal;

import java.util.Objects;

public class ProductCheese extends Product {
	private int age;

	
	public ProductCheese() {
		super();
	}
	
	public ProductCheese(String name, int price, int quantity) {
		super(name, price, quantity);
	}
	public ProductCheese(String name, int price, int quantity, int age) {
		super(name, price, quantity);
		this.age=age;
	}
    protected double discount() {
    	if (age<5) {
    		return 0.15;
    }
    return 0;
    }
	public ProductCheese(int age) {
		super();
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "ProductCheese [age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(age);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductCheese other = (ProductCheese) obj;
		return age == other.age;
	}
	
}