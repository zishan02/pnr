package com.PracticeProblems;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintTenRec {

	public void printTen(int n) {
		
		if(n<=10) {
			System.out.println(n);
			n++;
			printTen(n);
		}else {return;}
	}
	public static void main(String[] args) {
		Set s=new HashSet();
	s.add("");
		PrintTenRec obj=new PrintTenRec();
		obj.printTen(1);
		PrintTenRec obj2=new PrintTenRec();
		obj2=(PrintTenRec) obj.clone();
		lhs.add(5);
	}
	
}
