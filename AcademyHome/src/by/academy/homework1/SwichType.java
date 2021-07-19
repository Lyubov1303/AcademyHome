package by.academy.homework1;

import java.util.Scanner;

public class SwichType {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¬ведите данные:");	
		
		    int i = scan.nextInt();			 
			double d = scan.nextDouble();
			float f = scan.nextFloat();
			char c = scan.next().charAt(0);
			char x = (char) c;
			String str = scan.nextLine();
			String type = scan.next();
			
					
						
			switch (type) {
			case 1:
				System.out.println(i%2);
				break;
			case 2:	
				System.out.println(d*70/100);
				break;
			case 3:	
				System.out.println(f*f);
				break;
			case 4:	
				System.out.println(x);
				break;
			case 5:	
				System.out.println("Hello " +str);
				break;
			default:	
				System.out.println("Unsupported type");	
								
			}

			scan.close();
	}

}