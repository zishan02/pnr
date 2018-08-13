package com.PracticeProblems;
import java.util.Stack;

public class StringReverse {

	public void stringReverse(String s) {
		
		char []c=s.toCharArray();
		Stack<Character> st=new Stack<>();
		for(int i=0;i<c.length;i++) {
			st.push(c[i]);
			
		}
		while(!st.isEmpty()) {
			
			System.out.print(st.peek());
			st.pop();
		}
		
		
	}
	public static void main(String[] args) {
		StringReverse sr=new StringReverse();
		String s="ABCDEFG";
		sr.stringReverse(s);
		
	}
	
}
