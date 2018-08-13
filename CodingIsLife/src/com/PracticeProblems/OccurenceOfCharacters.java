package com.PracticeProblems;

public class OccurenceOfCharacters {

	public void findOccurenceOfCharacters(String s) {
		
		char []ch=s.toCharArray();
		int a[]=new int[256];
		
		for(int i=0;i<ch.length;i++) {
			int count =0;
			for(int j=0;j<ch.length;j++) {
				
				if(ch[i]==ch[j]) {
					
					count++;
				}
				
			}
			if(count>1) {
				a[ch[i]] = count;
			}
			
		}
		
		for(int i=0;i<256;i++) {
			if(a[i]!=0) {
				
				if(i>=65 && i<=90) {}
			System.out.println(i+" Count :" +a[i] );
			}
		}
		
	}
	public static void main(String[] args) {
		OccurenceOfCharacters obj=new OccurenceOfCharacters();
		String s="AAAABBBBCCCC";
		obj.findOccurenceOfCharacters(s);
		
		
	}
	
}
