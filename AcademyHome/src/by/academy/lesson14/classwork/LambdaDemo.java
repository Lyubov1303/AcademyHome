package by.academy.lesson14.classwork;

public class LambdaDemo {
	
	public static void main(String[] args) {
        
        Printable printer = s->System.out.println(s);
        printer.print("Hello Java!");
    } 
}

