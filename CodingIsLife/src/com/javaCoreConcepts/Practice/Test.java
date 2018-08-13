package com.javaCoreConcepts.Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

class Test {
	public void findString(List<?> list) {
		
		Iterator<?> itr=list.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}
	public static void main(String[] args) {
		
	
		Test obj=new Test();
		List<String> as= new ArrayList<String>();
		as.add("Zishan");
		as.add("Jhj");
		as.add("kkk");
		
		ConcurrentHashMap map=new ConcurrentHashMap();
		List<Integer> sa= new ArrayList<Integer>();
		sa.add(1);
		sa.add(2);
		obj.findString(sa);
	
	}
}