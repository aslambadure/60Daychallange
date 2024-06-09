package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	public static void main(String[] args) {
		//		Employee e = new Employee(10, "Aslam");
		//		 Employee e1=new Employee(20, "aplle");
		//		 Employee e2=new Employee(30, "hello");
		// 
		//		ArrayList<Employee> list = new ArrayList<>();

		//	Set<String> list = new HashSet<>();
		Map<Integer, String> list= new HashMap<Integer, String>();
		list.put(10, "PP");
		list.put(20,"add");

		System.out.println(list);

		for(Object obj:list.keySet()) {

			System.out.println(obj);
		}	
	}
}
