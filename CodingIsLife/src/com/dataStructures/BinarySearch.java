package com.dataStructures;
import java.util.Scanner;

public class BinarySearch {

	
	public void doBinarySearch(int a[],int SearchString,int n) {
		
		
		if(a[n/2]>SearchString) {
			
			doBinarySearch(a, SearchString,n/2);
			
		}else if(a[n/2]<SearchString) {
			
			doBinarySearch(a, SearchString, (3*n)/2);
		}else if(a[n/2]==SearchString) {
			System.out.println("Search String Found");
		}else if(n==0 || n==a.length) {
			System.out.println("Search String not Found");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,5};
		BinarySearch bs=new BinarySearch();
		bs.doBinarySearch(a,5, a.length);
	}
	
	
}
