package com.PracticeProblems;
import java.util.Scanner;

public class PatternAmDocs {

	
	public void printForward(int start, int end, String direction) {
		if(direction=="fwd") {
		for (int i=start;i<=end;i++) {
			
			if(i!=end)
			 System.out.print(i+"*");
			else
			 System.out.print(i);
			
		}
	}else if(direction=="bwd") {
		
		for (int i=end;i>=start;i--) {
			
			if(i!=start)
				 System.out.print(i+"*");
			else
				 System.out.print(i);
		
		}
	}
	}
	public static void main(String[] args) {
		PatternAmDocs patt=new PatternAmDocs();
		Scanner sc=new Scanner(System.in);
		int count=0;
		int N=sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			if(i%2==0) {
				
				patt.printForward(count+1, count+i, "bwd");
				count=count+i;
				System.out.print('\n');
			}else {
				
				patt.printForward(count+1, count+i, "fwd");
				count=count+i;
				System.out.print('\n');
			}
			
		}
		
	}
	
}
