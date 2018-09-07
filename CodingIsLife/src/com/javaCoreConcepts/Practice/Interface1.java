package com.javaCoreConcepts.Practice;

public interface Interface1 {

	void common();
	default void newMethod() {
		
		System.out.println("Default method of Interface1");
	}
}
