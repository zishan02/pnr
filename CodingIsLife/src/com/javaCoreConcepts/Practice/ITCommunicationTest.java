package com.javaCoreConcepts.Practice;

public class ITCommunicationTest {
   
   static int a=0; 	
	public static void main(String[] args) {
		Q q=new Q();
		Producer p=new Producer(q);
	
		Consumer c=new Consumer(q);
	}
}
