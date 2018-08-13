package com.javaCoreConcepts.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorImpl implements Comparable<ComparatorImpl> {


	private String name;
	private int rollNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	ComparatorImpl (String name, int rollNo){
		
		this.name=name;
		this.rollNo=rollNo;
	}
	
	public static void main(String[] args) {
		
		ComparatorImpl cmp=new ComparatorImpl("Zishan", 1);
		ComparatorImpl cmp2=new ComparatorImpl("Surya", 2);
		List<ComparatorImpl> list=new ArrayList<>();
		list.add(cmp);
		list.add(cmp2);
		Collections.sort(list);
		System.out.println(list);
		
	}
	@Override
	public int compareTo(ComparatorImpl o) {
		// TODO Auto-generated method stub
		
		return this.name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return "ComparatorImpl [name=" + name + ", rollNo=" + rollNo + "]";
	}

	
	
}
