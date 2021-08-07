package deal;

import java.util.Objects;

import deal.annatation.ProductProvide;

@ProductProvide(lifeTime = 12, parts = { "Фрукт, вода, сахар" })

public class ProductJuice extends Product {
	private String type;
	private double volume;

	
	public ProductJuice() {
		super();
	}


	public ProductJuice(String name, int price, int quantity) {
		super(name, price, quantity);
	}


	public ProductJuice(String type, double volume) {
		super();
		this.type = type;
		this.volume = volume;
	}

	public ProductJuice(String name, int price, int quantity, String type, double volume) {
		super(name, price, quantity);
		this.type = type;
		this.volume = volume;
	}
	protected double discount() {
    	if ("Apple".equals(type)) {
    		return 0.1;
    }
    return 0;
    }
	protected double discount1() {
    	if (volume>1.0) {
    		return 0.03;
    }
    return 0;
    }


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getVolume() {
		return volume;
	}


	public void setVolume(double volume) {
		this.volume = volume;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(type, volume);
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
		ProductJuice other = (ProductJuice) obj;
		return Objects.equals(type, other.type)
				&& Double.doubleToLongBits(volume) == Double.doubleToLongBits(other.volume);
	}
	
}
