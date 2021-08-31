package by.academy.homework6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Users> users = new ArrayList<>();

		users.add(new Users("Иван_1", "Иванов_1", 1));
		users.add(new Users("Иван_2", "Иванов_2", 2));
		users.add(new Users("Иван_3", "Иванов_3", 3));
		users.add(new Users("Иван_4", "Иванов_4", 4));
		users.add(new Users("Иван_5", "Иванов_5", 5));
		users.add(new Users("Иван_6", "Иванов_6", 6));
		users.add(new Users("Иван_7", "Иванов_7", 7));
		users.add(new Users("Иван_8", "Иванов_8", 8));
		users.add(new Users("Иван_9", "Иванов_9", 9));
		users.add(new Users("Иван_10", "Иванов_10", 10));

		File dir = new File("src\\io\\homework6\\users");

		if (!dir.exists()) {
			dir.mkdirs();
		}
		
		for (Users user : users) {
			try (ObjectOutputStream outputUserFile = new ObjectOutputStream(new FileOutputStream(
					dir.getAbsolutePath() + "\\" + user.getName() + "_" + user.getSurname() + ".txt"))) {
				outputUserFile.writeObject(user);
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
