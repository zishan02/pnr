package com.PracticeProblems;

import java.io.BufferedReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class KadanesAlgo {

	
	
	
	public void computeMaxSubArray(int a[]) {
		
		
		int maxSum=a[0];
		int globMax=a[0];
		for(int i=1;i<a.length;i++) {
			
			if(maxSum+a[i]>maxSum) {
				maxSum=maxSum+a[i];
			}
			if(maxSum>globMax)
				globMax=maxSum;
			
		}
		System.out.println(globMax);
	}
	
	public static void main(String[] args) {
		double d=200;
		int a[]=new int[5];
		long a=6;

		BigDecimal bd=new BigDecimal(d);
		bd.setScale(4);
		KadanesAlgo ka=new KadanesAlgo();
		BufferedReader sc=new BufferedReader();
		int testCases=sc.nextInt();
		for(int i=0;i<testCases;i++)
		{
			int N=sc.nextInt();
			int a[]=new int[N];
			
			for(int j=0;j<N;j++) {
				a[j]=sc.nextInt();
			}
			ka.computeMaxSubArray(a);
		}
		sc.close();
		
		
	}
}
