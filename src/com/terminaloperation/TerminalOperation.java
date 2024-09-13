package com.terminaloperation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TerminalOperation {

	public static void main(String[] args) {

		// 3.1 Collecting to a List, Set, or Map

		List<String> names = Arrays.asList("John", "Tom", "Sarah", "John", "Devendra", "Ani");

		// Collecting into a Set (removes duplicates)

		Set<String> dublicate = names.stream().collect(Collectors.toSet());

		System.out.println(dublicate);

		// Collecting into a Map
		Map<String, Integer> nameLengthMap = names.stream()
				.collect(Collectors.toMap(name -> name, name -> name.length(), (existing, replacement) -> existing));
		System.out.println(nameLengthMap);

		// 3.2 Counting Elements

		long count = names.stream().filter(name -> name.length() > 5).count();
		System.out.println(count);

		// 3.3 Reduce (Summing/Combining elements)

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum);

	}

}
