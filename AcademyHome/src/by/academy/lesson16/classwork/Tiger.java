package by.academy.lesson16.classwork;

import java.util.Objects;

public class Tiger extends Cat {
	public String  color="B-Y";
	protected double weight= 50.6;
	private int speed=50;
	public void whatColor () {
		System.out.println(color);
	};
	
	protected void whatWeight() {
		System.out.println(weight);
	};
	private void whatSpeed () {
		System.out.println(speed);
	}

	public Tiger() {
		super();
		
	}

	public Tiger(String name, String type, int age) {
		super(name, type, age);
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(color, speed, weight);
		return result;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void whatName() {
		// TODO Auto-generated method stub
		super.whatName();
	}

	@Override
	protected void whatType() {
		
		super.whatType();
	}

	@Override
	public String getName() {
		
		return super.getName();
	}

	@Override
	public void setName(String name) {
		
		super.setName(name);
	}

	@Override
	public String getType() {
		
		return super.getType();
	}

	@Override
	public void setType(String type) {
		
		super.setType(type);
	}

	@Override
	public int getAge() {
		
		return super.getAge();
	}

	@Override
	public void setAge(int age) {
		super.setAge(age);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tiger other = (Tiger) obj;
		return Objects.equals(color, other.color) && speed == other.speed
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

	
	
}