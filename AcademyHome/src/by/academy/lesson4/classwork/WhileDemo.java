package by.academy.lesson4.classwork;

public class WhileDemo {
	public static void main(String [] args) {
	int i = 0;
	int sum = 0; 
			
	while (i < 7) {
         if (i % 2 == 0) {
			 sum += i;
		 }
i++;
}
	System.out.print("sum = " + sum);

}
}
