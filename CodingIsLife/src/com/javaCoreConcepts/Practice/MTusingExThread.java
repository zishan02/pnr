package com.javaCoreConcepts.Practice;

public class MTusingExThread extends Thread{

 static Integer a=1;
 
	public void run() {
		
			
			synchronized(a) {
				a=a+1;
			}
		}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		MTusingExThread MT=new MTusingExThread();
		//Thread.currentThread().setPriority(7);
		
		//MT.setPriority(10);
		Thread t1=new Thread(MT);
		Thread t2=new Thread(MT);
		Thread t3=new Thread(MT);
		t1.start();
		t2.start();
		t3.start();
		for(int i=0;i<5;) {
	i=i+1;
	System.out.println(i);
		}
		System.out.println(a);
		//MT.start();
		//System.out.println(Thread.currentThread().getName());
	
	}
}
