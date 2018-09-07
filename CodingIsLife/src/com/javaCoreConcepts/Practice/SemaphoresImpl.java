package com.javaCoreConcepts.Practice;

import java.util.concurrent.Semaphore;

public class SemaphoresImpl implements Runnable {
	Semaphore sem=new Semaphore(2);
	@Override
	public void run() {
		
		
		sem.acquireUninterruptibly(2);
		System.out.println(Thread.currentThread().getName());
		try {
		Thread.sleep(100);
		
		}catch(InterruptedException e){
			
			e.printStackTrace();
		}
		sem.release();
		
	}
	
	
	
	public static void main(String[] args) {
		
		SemaphoresImpl sl=new SemaphoresImpl();
		Thread th1=new Thread(sl);
		Thread th2=new Thread(sl);
		Thread th3=new Thread(sl);
		Thread th4=new Thread(sl);
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		
		
		
	}

}
