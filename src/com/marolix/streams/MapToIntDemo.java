package com.marolix.streams;

import java.util.List;

import com.marolix.Collections.Employee;

public class MapToIntDemo {

	public static void main(String[] args) {
		List<FlatMapDemo.Employee> empList = FlatMapDemo.empList();
		empList.stream().mapToInt((FlatMapDemo.Employee e) -> e.empId).forEach((int t) -> {
		});
		//map->Stream<>
		//mapToInt->IntStream
//ToIntFunction
	}

}
