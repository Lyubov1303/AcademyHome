package by.academy.lesson3.classwork;
import java.util.Scanner;
public class ScannerDemoHome {

	 public static void main(String[] args) {

	       Scanner scanner = new Scanner("����� ����, ����� ��������,\n" +
	               "����� ���� �������, �������� ���,\n" +
	               "���� ��������� �������,\n" +
	               "��������� �� ������");
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
