package by.academy.lesson4.classwork;

public class IndexOfDemo {
public static void main(String [] args) {
	String s = "��� ������ �� �������� � ����� Java ������������ ������ String, StringBuilder, StringBufferS";
  String findS = "S";
 int index = -1;
 System.out.println(s);
 do {
	 index =s.indexOf("S", index==-1 ? 0: index+1);
	 if (index !=-1) {
		 System.out.println(index);
		 
	 }
 } while (index !=-1);
 }
}