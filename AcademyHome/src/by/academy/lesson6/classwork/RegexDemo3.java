package by.academy.lesson6.classwork;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexDemo3 {
    public static void main(String[] args) {
        System.out.println(test("Versions: Java  5, Java 6, Java   7, Java 8, Java 12."));
       
    }
    public static boolean test(String testString) {
        Pattern pattern = Pattern.compile("[Java ]+[\\d]+");
        Matcher matcher = pattern.matcher(testString);
        return matcher.matches();
    }
}
