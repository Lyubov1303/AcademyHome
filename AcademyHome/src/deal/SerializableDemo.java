package deal;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {

	public static void main(String[] args) {

		ProductCheese cheese1 = new ProductCheese("Cheese", 12, 1);
		try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
				new FileOutputStream("src\\io\\productCheese.txt"));
				ObjectOutputStream osu = new ObjectOutputStream(bufferedOutputStream)) {
			osu.writeObject(cheese1);


		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		try (BufferedInputStream br = new BufferedInputStream(new FileInputStream("src\\io\\productCheese.txt"));
				ObjectInputStream isu = new ObjectInputStream(br)) {
			ProductCheese cheese2 = (ProductCheese) isu.readObject();
			System.out.println(cheese2);
			

		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}