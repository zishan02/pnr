package com.javaCoreConcepts.Practice;

public abstract class ABSClass {

	int x,y;
	
	ABSClass(int x,int y){
		
		this.x=x;
		this.y=y;
		System.out.println(this.x+""+this.y);
	}
	
	public void display() {
		
		System.out.println(this.x+""+this.y);
	}
	
	
}
