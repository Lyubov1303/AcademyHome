package by.academy.homework5.maxMark;

public class MarkArrayList extends Student{
	
	public int [] marks= new int[10];
	Student s1=new Student("AAA", marks);
	//Student s2=new Student("Si", marks);



public static void main(String[] args) {
	System.out.println(s1.toString());
}
	
}