package by.academy.homework7;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
	private String firstName;
	private String secondName;
	private int age;
	private LocalDate dateOfBirth;

	public Person() {
		super();

	}

	public Person(String firstName, String secondName, int age, LocalDate dateOfBirth) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [firstName=");
		builder.append(firstName);
		builder.append(", secondName=");
		builder.append(secondName);
		builder.append(", age=");
		builder.append(age);
		builder.append(", dateOfBirth=");
		builder.append(dateOfBirth);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, dateOfBirth, firstName, secondName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(dateOfBirth, other.dateOfBirth)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(secondName, other.secondName);
	}

}
