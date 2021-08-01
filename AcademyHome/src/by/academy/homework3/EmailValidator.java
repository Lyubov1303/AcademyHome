package by.academy.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {

	@Override
	public boolean validate(String s) {
		Pattern pattern = Pattern.compile("[a-z.]+@[a-z]+\\.[a-z]{2,3}");
        Matcher matcher = pattern.matcher(s);
		
		return matcher.matches();
	}

}