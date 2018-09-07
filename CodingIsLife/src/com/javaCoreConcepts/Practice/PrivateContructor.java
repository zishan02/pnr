package com.javaCoreConcepts.Practice;

public class PrivateContructor {

	private String a;
	 int t=0;
	private PrivateContructor(String a){
		this.a=a;
		
	}
	
	 public PrivateContructor() {
		this("5");

	}
	 
public static void main(String[] args) throws InterruptedException{
	

	Thread.sleep(1000);
	System.out.println("jjj");
}	
	 
	
}
