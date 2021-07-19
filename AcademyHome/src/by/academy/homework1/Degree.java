package by.academy.homework1;

public class Degree {
	
	
		public static void main(String[] args) {
		
		int n = 2;
		int j = 1;
		int r=n*j;
			
		do {  
			System.out.println(n+ " в степени " +j+"="+ r); 
			j++;
			r=r*j;
			}while (r<=1_000_000)
	    	;
}
	}

