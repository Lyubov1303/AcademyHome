package by.academy.homework1;

import java.util.Scanner;

public class FinPrice {
	
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("������� ����� �������: ");
			int sum = scan.nextInt();
			System.out.println("������� ��� �������: ");
			int age = scan.nextInt();
			
			double discount1 =5;
			double discount2 =7;
			double discount3 =12;
			double discount3_1 =discount3 + 4;
			double discount3_2 =discount3 - 3;
			double discount4 =15;
			double discount5 =20;
				
			if (sum<100) {
				double Sum1=sum*(1-discount1/100);
				int FinPrice1 = (int) Sum1;
				
				System.out.println("����� � ������ � ������ ������ ���������� "+ FinPrice1+" ���.");
			}
				
			if (sum>=100 && sum<200) {
				double Sum2=sum*(1-discount2/100);
				int FinPrice2 = (int) Sum2;
				System.out.println("����� � ������ � ������ ������ ���������� "+ FinPrice2+" ���.");
			}

			if (sum>=200 && sum<300) {
				
				    if (age>=18) {
					discount3=discount3_1;
				    }
				    else {
				    discount3=discount3_2;
				    }
				 double Sum3=sum*(1-discount3/100);
				 int FinPrice3 = (int) Sum3;
			     System.out.println("����� � ������ � ������ ������ ���������� "+ FinPrice3+" ���.");
	        }
			
			if (sum>=300 && sum<400) {
				 double Sum4=sum*(1-discount4/100);
				 int FinPrice4 = (int) Sum4;
			     System.out.println("����� � ������ � ������ ������ ���������� "+ FinPrice4+" ���.");
	        }
			if (sum>=400) {
				 double Sum5=sum*(1-discount5/100);
				 int FinPrice5 = (int) Sum5;
			     System.out.println("����� � ������ ���������� "+ FinPrice5+" ���.");
	        }
			scan.close();
		}

		}
