package com.javaCoreConcepts.Practice;

public class MTJoin extends Thread {

	public void run() {
		
		for(int i=0;i<10;i++) {
			
			System.out.println("Child Thread");
			
			
		}
	}
	public static void main(String[] args) throws InterruptedException {
		
		MTJoin mt=new MTJoin();
		
		
		mt.start();
		Thread.yield();
		for(int i=0;i<10;i++) {
			
			System.out.println("MAIN THREAD");
		}
	
		
	}
}
