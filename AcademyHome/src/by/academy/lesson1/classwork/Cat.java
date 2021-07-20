package by.academy.lesson1.classwork;

public class Cat {
	int age;
	String nickname;
	double money;
	char initials;
	boolean isHomeAnimal;

	public Cat() {

	}

	public Cat(String nickname) {
		this.nickname = nickname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public char getInitials() {
		return initials;
	}

	public void setInitials(char initials) {
		this.initials = initials;
	}

	public boolean getIsHomeAnimal() {
		return isHomeAnimal;
	}

	public void setIsHomeAnimal(boolean isHomeAnimal) {
		this.isHomeAnimal = isHomeAnimal;
	}

	public void grow(int i) {
		System.out.println("The cat grows " + i + " times.");
		age = age + i;
	}

	public void sleep() {
		System.out.println("The cat is sleeping.");

	}

	public void eat() {
		System.out.println("The cat is eating.");

	}

	public void walk() {
		System.out.println("The cat is walking.");

	}

	public void Age() {
		System.out.println("The cat " + nickname + " is " + age + " years old.");
	}

}
