package com.javaCoreConcepts.Practice;

import java.util.concurrent.Callable;

public class ThreadingMT implements Callable<Object> {

@Override
public Object call() throws Exception {

	int a=10;
	
	
	return a;
}

	
	
}
