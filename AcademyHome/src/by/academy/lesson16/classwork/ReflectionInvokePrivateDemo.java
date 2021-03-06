package by.academy.lesson16.classwork;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class ReflectionInvokePrivateDemo {
	public static void main(String... args) {

		Car car = new Car(100, "AA180A1");
		Class<? extends Car> carClass = car.getClass();

		try {
			Method startEngineMethod = carClass.getDeclaredMethod("printObject");
			//startEngineMethod.setAccessible(true);
			startEngineMethod.invoke(car); // output: Wroooommmm

		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}