package com.test.files;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(1, 1000));
		empList.add(new Employee(2, 2000));
		empList.add(new Employee(3, 1500));
		empList.add(new Employee(4, 100));
		empList.add(new Employee(5, 3000));
		
	//	empList.stream().sorted(o1,o2) -> (o2.getSal() - o1.getSal()).collect(Collectors.toList());

	}

}
