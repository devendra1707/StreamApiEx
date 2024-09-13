package com.basic_stream_operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringElement {

	public static void main(String[] args) {

		// 1.1 Filter Name

		List<String> list = Arrays.asList("John", "Atul", "Anil", "Suraj", "Devendra");
		List<String> filterElement = list.stream().filter(name -> name.startsWith("S")).collect(Collectors.toList());
		System.out.println("Filter Element :: " + filterElement);

		// 1.2 Mapping Value

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		List<Integer> mapEx = list1.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println("Mapping :: " + mapEx);

		// 1.3 Sorting

		List<String> unsortedList = Arrays.asList("Aman", "Deva", "Suraj", "Atul", "Arjun");
		List<String> sorList = unsortedList.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted List :: " + sorList);

	}

}
