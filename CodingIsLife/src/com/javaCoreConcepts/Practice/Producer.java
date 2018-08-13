package com.javaCoreConcepts.Practice;

public class Producer implements Runnable {

	Q q;
Producer(Q q){

	this.q=q;
	Thread th=new Thread(this,"Producer");
	th.start();
	
}

	@Override
	public  void run() {
	
		
  while(true) {
	q.set();
	try {
		
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
  }
	
}
}
