package com.javaCoreConcepts.Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TEST {

	
	public static void main(String[] args) {
		
		/*Employee e1=new Employee("12", "Zishan", "SE");
		Employee e2=new Employee("12", "Zishan", "SE");
		Employee e3=new Employee("12", "Zishan", "SE");
	    String s1=new String("Zishan");
	    String s2=new String("Zishan");
		HashMap map=new HashMap();
		map.put(e1, "Zishan");
		map.put(e2, "Pankaj");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	
		System.out.println(map.get(e3));*/
		/*
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		list.forEach(i -> System.out.println(i));*/
		
		Employee ee=new Employee("1","Zishan","System Engineer");
		Employee ee2=new Employee("1","Zishan","System Engineer");
		Employee ee3=ee;
		System.out.println(ee.hashCode());
		System.out.println(ee2.hashCode());
		System.out.println(ee3.hashCode());
		
		Object i=1;
		Integer r=new Integer(1);
		
		HashSet<Employee> ssett=new HashSet<Employee>();
		ssett.add(ee);
		ssett.add(ee2);
		ssett.add(ee3);
		
		System.out.println(ssett);
		
	}
	
}
