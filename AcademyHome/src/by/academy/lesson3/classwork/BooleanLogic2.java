package by.academy.lesson3.classwork;

public class BooleanLogic2 {
	
		public static void main(String[] args) {
			int d = 0;
			int num = 10;

			if (d != 0 && num / d > 10) {
				// ≈сли же логическое выражение переписать как d != 0 & num / d > 10, то правое
				// выражение вычисл€тьс€ будет. » в этом случае программа выбросит исключение
				// времени выполнени€ с сообщением - на ноль делить нельз€.
				System.out.println("num = " + num);
			}
		}
}
