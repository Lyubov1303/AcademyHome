package by.academy.lesson15.classwork;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;

public class Task1 {
	public static void main(String[] args) {

		List<String> list = Stream.generate(() -> new Random().nextInt(1000)).limit(1000).skip(50)
				.filter(i -> i % 2 == 0).sorted().distinct().map(i -> "Число " + i).limit(200)
				.collect(Collectors.toList());

		System.out.println(list);
		
		
		List<Integer> list2 = Stream.generate(() -> new Random().nextInt(1000)).limit(1000).skip(50)
				.filter(i -> i % 2 == 0).sorted().distinct().limit(200)
				.collect(Collectors.toList());

		System.out.println(list2);
		System.out.println(list2.stream().min(Comparator.comparing(Integer::valueOf)));
		System.out.println(list2.stream().max(Comparator.comparing(Integer::valueOf)));
		
	}
}