package by.academy.lesson7.classwork;

import java.util.Objects;

public class ProductWine extends Product {
	private String color;
	
	
	public ProductWine() {
		super();
		
	}
	public ProductWine(String name, int price, int quantity) {
		super(name, price, quantity);
	}
	
	public ProductWine(String name, int price, int quantity, String color) {
		super(name, price, quantity);
		this.color=color;
	}
	protected double discount() {
    	if ("Red".equals(color)) {
    		return 0.25;
    };
    return 0;
    }
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "ProductWine [color=" + color + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(color);
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
		ProductWine other = (ProductWine) obj;
		return Objects.equals(color, other.color);
	}
		
}

