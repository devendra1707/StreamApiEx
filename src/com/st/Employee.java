package com.st;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {
	String name;
	int age;
	double salary;

	Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("John", 30, 5000), new Employee("Tom", 45, 7000),
				new Employee("Sarah", 25, 6000), new Employee("Suraj", 35, 8000));

		// Filter employees with salary > 6000
		List<Employee> richEmployees = employees.stream().filter(emp -> emp.getSalary() > 6000)
				.collect(Collectors.toList());

		System.out.println(richEmployees);

		// Get list of employee names
		List<String> employeeNames = employees.stream().map(Employee::getName).collect(Collectors.toList());
		System.out.println(employeeNames);

		// Find employees with a salary greater than 5000 and age less than 40.
		List<Employee> filteredEmployees = employees.stream().filter(e -> e.getSalary() > 5000 && e.getAge() < 40)
				.collect(Collectors.toList());
		System.out.println(filteredEmployees);

		// Convert a list of strings into a single string with comma-separated values
		List<String> names = Arrays.asList("John", "Jane", "Tom", "Sara");
		String result = names.stream().collect(Collectors.joining(", "));
		System.out.println(result);

		
		// Find the maximum salary from a list of employees.
		
		Optional<Employee> maxSalaryEmployee = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));

		System.out.println(maxSalaryEmployee);
	}
}
