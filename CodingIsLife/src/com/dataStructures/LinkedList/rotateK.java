package com.dataStructures.LinkedList;

public class rotateK {

	
	public LinkedList rotateK(LinkedList head) {
		
		LinkedList a=head;
		LinkedList b=head;
		int count=1;
		while(count!=4 && a!=null) {
			
			count++;
			a=a.getNext();
		}
		
		while(b.getNext()!=null) {
			
			b=b.getNext();
		}
		
		b.setNext(head);
		head=a.getNext();
		a.setNext(null);
		
		return head;
	}
}
