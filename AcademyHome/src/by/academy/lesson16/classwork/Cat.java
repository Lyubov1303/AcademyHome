package by.academy.lesson16.classwork;

import java.util.Objects;

public class Cat {
	public String name ="Cat";
	protected String type= "Cat";
	private int age=1;
	public void whatName () {
		System.out.println("Hi! What your name? I'm "+name);
	};
	
	protected void whatType() {
		System.out.println("What your type? I'm "+ type);
	};
	private void howOld () {
		System.out.println("How old are you? I'm "+age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Cat() {
		super();
		}

	public Cat(String name, String type, int age) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(age, name, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", type=" + type + ", age=" + age + "]";
	}

}
