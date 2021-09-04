package by.academy.homework7;


import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

	private static List<Long> generateLongList(Integer seed, Integer size) {

		Supplier<Long> s = () -> (long) new Random().nextInt(seed);

		return Stream.generate(s).limit(size).collect(Collectors.toList());
	}
	public static void main(String... args) {

		List<Long> longList = generateLongList(100, 100);
			
}
}