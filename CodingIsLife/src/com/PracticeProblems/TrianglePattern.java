package com.PracticeProblems;
/***************************************************************************
For Pattern

1
12
123
1234

Coded by : Zishan

****************************************************************************/


public class TrianglePattern {

	
	public void printPattern(int n) {
		
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++)
			{
			System.out.print(j);
			}
			System.out.print('\n');
		}
		
	}
	public static void main(String[] args) {
		
		TrianglePattern patt=new TrianglePattern();
		patt.printPattern(4);
	}
}
