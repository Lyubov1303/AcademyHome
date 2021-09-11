package by.academy.homework7;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task2 {

	public static void main(String[] args) {

		User user = new User();

		Class<User> userClass = User.class;

		System.out.println("getMethod(name)");

		try {
			Method getprintUserInfoMethod = userClass.getMethod("printUserInfo");
			System.out.println(getprintUserInfoMethod);

		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		System.out.println("getMethods()");

		Method[] methods = userClass.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}

		System.out.println("getField(name)");

		try {
			Field getloginField = userClass.getField("login");

			System.out.println(getloginField);

		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException e) {
			e.printStackTrace();
		}

		System.out.println("getFields()");

		Field[] fields = userClass.getFields();
		for (Field field : fields) {
			System.out.println(field);
		}

		System.out.println("getDeclaredMethod(name)");

		try {
			Method getprintUserInfoMethod = userClass.getDeclaredMethod("printUserInfo");
			System.out.println(getprintUserInfoMethod);

		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		System.out.println("getDeclaredMethods()");

		Method[] methodsDeclared = userClass.getDeclaredMethods();
		for (Method method : methodsDeclared) {
			System.out.println(method);
		}

		System.out.println("getDeclaredField (name)");

		try {

			Field loginField = userClass.getDeclaredField("password");
			loginField.setAccessible(true);

			System.out.println(loginField);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException e) {
			e.printStackTrace();
		}

		System.out.println("getDeclaredFields()");

		Field[] declaredFields = userClass.getDeclaredFields();

		for (Field field : declaredFields) {
			System.out.println(field);
		}

		System.out.println("getSetInvoke");

		System.out.println(user.toString());

		try {

			Field login = userClass.getDeclaredField("login");
			login.setAccessible(true);
			login.set(user, "7777");
			Field password = userClass.getDeclaredField("password");
			password.setAccessible(true);
			password.set(user, "1234");
			Field email = userClass.getDeclaredField("email");
			email.setAccessible(true);
			email.set(user, "7777@email.com");
			Method toString = userClass.getMethod("toString");
			Object toStringInvoke = toString.invoke(user);
			System.out.println(toStringInvoke);

		} catch (NoSuchMethodException | SecurityException | NoSuchFieldException | IllegalArgumentException
				| InvocationTargetException | IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}
