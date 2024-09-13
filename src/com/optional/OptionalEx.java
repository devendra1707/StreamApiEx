package com.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("K", "B", "C", "D", "E", "F", "G", "H");

		// 5.1 Finding First Element
		Optional<String> first = names.stream().findFirst();

		System.out.println(first);

		// 5.2 Finding Any Element

		Optional<String> any = names.stream().findAny();
		System.out.println(any);

		// 5.3 Max/Min

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		Optional<Integer> max = numbers.stream().max(Integer::compareTo);
		Optional<Integer> min = numbers.stream().min(Integer::compareTo);

		System.out.println("MAX :: " + max + " MIN :: " + min);

	}
}
