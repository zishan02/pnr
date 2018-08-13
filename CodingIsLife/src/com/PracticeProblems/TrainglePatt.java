package com.PracticeProblems;
/*for Pattern
_________________________________
   *                             
  * *
 * * *
* * * * 

________________________
*/




import java.util.Scanner;

public class TrainglePatt {

	
	
	public void drawPattern(int n) {
		
		
		
		for(int i=1;i<=n;i++) {
			for(int k=n-i;k>0;k--) {
				
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
			
				if(j==i) {
					System.out.print("*");
				}else {
				System.out.print("*");
				System.out.print(" ");
				}
			}
			System.out.print('\n');
		}
		
	}
	public static void main(String[] args) {
		
		TrainglePatt patt=new TrainglePatt();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		patt.drawPattern(n);
		sc.close();
	}
}
