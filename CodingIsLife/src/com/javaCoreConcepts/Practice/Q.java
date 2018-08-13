package com.javaCoreConcepts.Practice;

public class Q {

	int num;
	boolean valueSet=false;
	public synchronized void set() {
		
		while(valueSet) {
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		num++;
		System.out.println("Set :"+num);
		valueSet=true;
		notify();
	}
	
	public synchronized void get() {
	while(!valueSet) {
		
	try {
		wait();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
		
		System.out.println("GET :"+num);
		valueSet=false;
		notify();
	}
	
	
}
