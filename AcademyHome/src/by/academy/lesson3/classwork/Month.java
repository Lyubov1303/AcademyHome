package by.academy.lesson3.classwork;

import java.util.Scanner;

public class Month {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� ������ ������ ��������:");
		
		int i = sc.nextInt();
		
		switch (i) {
		case 1:
			System.out.println("������");
			break;
		case 2:
			System.out.println("�������");
			break;
		case 3:
			System.out.println("����");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("���");
			break;
		case 6:
			System.out.println("����");	
			break;
		case 7:
			System.out.println("����");
			break;
		case 8:
			System.out.println("������");
			break;
		case 9:
			System.out.println("��������");
			break;
		case 10:
			System.out.println("�������");
			break;
		case 11:
			System.out.println("������");
			break;
		case 12:
			System.out.println("�������");
			break;
		default:
			System.out.println("������ � ����� ������� �� ����������");
			break;
		}
		sc.close();
	}
}
