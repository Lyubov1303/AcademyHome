package by.academy.homework5.maxMark;

import java.util.Arrays;
import java.util.Objects;

public class Student {

	String name;

	int[] marks;

	public Student(String name, int[] marks) {
		super();
		this.marks = marks;
		this.name = name;
	}

	public Student() {
		super();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// public int[] getMarks() {
	// int [] marks= new int[10];
	// for (int i = 0; i < marks.length; i++) {
	// marks[i] = ((int)(Math.random() * 10));
	// return marks;
	// }
	// return null;
	// }

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(marks);
		result = prime * result + Objects.hash(name);
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
		Student other = (Student) obj;
		return Arrays.equals(marks, other.marks) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [name=");
		builder.append(name);
		builder.append(", marks=");
		builder.append(Arrays.toString(marks));
		builder.append("]");
		return builder.toString();
	}

}
