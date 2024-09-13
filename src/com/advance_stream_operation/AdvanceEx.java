package com.advance_stream_operation;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class AdvanceEx {

	public static void main(String[] args) {

		// 2.1 FlatMap (Flattening multiple collections into one)

		List<List<String>> nestedList = Arrays.asList(Arrays.asList("one", "two"), Arrays.asList("three", "four"));
		List<String> flattenedList = nestedList.stream().flatMap(Collection::stream).collect(Collectors.toList());

		System.out.println(flattenedList);

		// 2.2 Distinct Elements

		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4);
		List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctNumbers);
		
		// 2.3 Limit and Skip
		
		List<Integer> number = Arrays.asList(0,1, 2, 2, 4, 5, 6);
		List<Integer> limitedNumbers = number.stream()
		                                      .limit(3)
		                                      .collect(Collectors.toList());
		System.out.println(limitedNumbers);

		List<Integer> skippedNumbers = number.stream()
		                                      .skip(2)
		                                      .collect(Collectors.toList());
		System.out.println(skippedNumbers);

		

	}
}
