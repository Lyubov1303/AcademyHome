package by.academy.lesson6.classwork;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexDemo4 {
    public static void main(String[] args) {
        System.out.println(test("google.com"));
        System.out.println(test("reference1.by"));
        System.out.println(test("reference1.org"));
    }
    public static boolean test(String testString) {
        Pattern pattern = Pattern.compile(".+\\.(com|ua|ru|org)");
        Matcher matcher = pattern.matcher(testString);
        return matcher.matches();
    }
}
