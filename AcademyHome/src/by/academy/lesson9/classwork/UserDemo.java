package by.academy.lesson9.classwork;

public class UserDemo {
	public static void main (String...args) {
		User user1=new User();
		user1.createQuery();
		User.Query q1 = new User.Query();
		q1.printToLog();
		User.Query q2 = new User.Query();
		q2.printToLog();
		
			
			
	}

}
