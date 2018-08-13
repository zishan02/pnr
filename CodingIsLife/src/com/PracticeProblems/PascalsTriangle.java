package com.PracticeProblems;
import java.util.Scanner;

public class PascalsTriangle {

	
	
	
	public void printPascalsTriangle(int n) {
		
		int number=1;
		for(int i=0;i<=n;i++) {
			
			for(int k=n-i;k>0;k--) {
				
				System.out.print(" ");
			}
			number=1;
			for(int j=0;j<=i;j++) {
				System.out.print(number+" ");
				number=number*(i-j)/(j+1);
				
			}
			System.out.print('\n');
			
		}
		
	}
	public static void main(String[] args) {
		
		PascalsTriangle pt=new PascalsTriangle();
		Scanner sc=new Scanner(System.in);
		pt.printPascalsTriangle(sc.nextInt());
		sc.close();
		
	}
	
}
