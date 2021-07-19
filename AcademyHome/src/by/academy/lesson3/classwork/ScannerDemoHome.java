package by.academy.lesson3.classwork;
import java.util.Scanner;
public class ScannerDemoHome {

	 public static void main(String[] args) {

	       Scanner scanner = new Scanner("Люблю тебя, Петра творенье,\n" +
	               "Люблю твой строгий, стройный вид,\n" +
	               "Невы державное теченье,\n" +
	               "Береговой ее гранит");
	       String s = scanner.nextLine();
	       System.out.println(s);
	       s = scanner.nextLine();
	       System.out.println(s);
	       s = scanner.nextLine();
	       System.out.println(s);
	       s = scanner.nextLine();
	       System.out.println(s);
	       
	       scanner.close();
	   }
	}
