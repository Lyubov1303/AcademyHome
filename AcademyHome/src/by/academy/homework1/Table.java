package by.academy.homework1;

	import java.util.Scanner;

	public class Table {
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("������� � ������� ����� �� 1 �� 10:");
			 int n = scan.nextInt();
			 
		if (n < 10 && n > 1){
		               
			   for(int j=1;j<=10;j++)
			        {
			             System.out.println(n+"x"+j+ "="+(n*j)+"\t");   
			        }
		}
		else {
			System.out.println("�� ����� ������������ �����");
		}
		
			  scan.close();
			  }
	}


