package by.academy.lesson6.classwork;

	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	
	public class RegDemo {
	    public static void main(String[] args) {
	        Pattern pattern = Pattern.compile ("c*ab");
	        Matcher matcher = pattern.matcher("aaab");	    
	        Matcher matcher1 = pattern.matcher("cab");
	        Matcher matcher2 = pattern.matcher("ccab");
	        Matcher matcher3 = pattern.matcher("cccab");
	        boolean b = matcher.matches();
	        boolean b1 = matcher1.matches();
	        boolean b2 = matcher2.matches();
	        boolean b3 = matcher3.matches();
	        System.out.println(b);
	        System.out.println(b1);
	        System.out.println(b2);
	        System.out.println(b3);
	    }
	}
