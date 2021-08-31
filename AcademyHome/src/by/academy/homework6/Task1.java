package by.academy.homework6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static final String task1 = "src\\io\\homework6\\task1.txt";

	public static void main(String[] args) throws IOException {

		File dir = new File("src\\io\\homework6\\");

		if (!dir.exists()) {
			dir.mkdirs();
		}
		File inputFile = new File(task1);

		if (!inputFile.exists()) {
			inputFile.createNewFile();
		}

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			try (BufferedWriter writter = new BufferedWriter(new FileWriter(task1))) {
				String line;
				while (!(line = reader.readLine()).equals("stop")) {
					writter.write(line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
