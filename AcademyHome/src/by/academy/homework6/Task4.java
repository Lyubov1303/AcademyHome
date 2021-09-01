package by.academy.homework6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task4 {

	private static Random random = new Random();
	private static String text;

	public static void main(String[] args) {
		
		File dir = new File("src\\io\\homework6\\task4");
		if (!dir.exists()) {
			dir.mkdirs();
		}

		File file;
		for (int i = 1; i <= 100; i++) {
			file = new File(dir.getAbsolutePath() + "\\" + i + ".txt");
			try {
				if (!file.exists()) {
					file.createNewFile();
				}
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
		file = new File("src\\io\\homework6\\task2.txt");
		if (!file.exists()) {
			System.err.println("Текстовый файл отсутствует");
			return;
		}
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
			text = bufferedReader.readLine();
			for (int i = 1; i <= 100; i++) {
				file = new File("src\\io\\homework6\\task4\\" + i + ".txt");
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write(text.substring(0, random.nextInt(text.length())));
				fileWriter.close();
			}
			file = new File("src\\io\\homework6\\task4\\result.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fileWriter = new FileWriter(file);
			File[] files = dir.listFiles();
			for (int i = 0; i < files.length; i++) {
				fileWriter.write(files[i].getName() + " " + files[i].length() + "\r\n");
			}
			fileWriter.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

}