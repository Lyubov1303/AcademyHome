package by.academy.homework7;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

	private static List<Long> generateLongList(Integer seed, Integer size) {

		Supplier<Long> s = () -> (long) new Random().nextInt(seed);

		return Stream.generate(s).limit(size).peek(i -> i = (long) (i * Math.PI) - 20).filter(n -> n < 100).sorted()
				.skip(3).collect(Collectors.toList());
	}

	public static void main(String... args) {

		List<Long> longList = generateLongList(100, 100);

		Map<Long, String> map = longList.stream()
				.collect(Collectors.toMap(i -> i, key -> "Number: " + key, (i, key) -> i));

		System.out.println(map);

	}
}