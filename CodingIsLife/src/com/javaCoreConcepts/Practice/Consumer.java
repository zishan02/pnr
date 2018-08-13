package com.javaCoreConcepts.Practice;

public class Consumer implements Runnable {
	
	Q q;
	 Consumer(Q q) {
		this.q=q;
		Thread th=new Thread(this, "Consumer");
		th.start();
		}


	@Override
	public void run() {
	
		while(true) {
		q.get();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
}
