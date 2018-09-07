package com.dataStructures.LinkedList;

public class LinkedList {

	private LinkedList next;
	private int data;

	public LinkedList( int data) {
		super();
		
		this.data = data;
	}
	public LinkedList getNext() {
		return next;
	}
	public void setNext(LinkedList next) {
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	LinkedList addFront(int data, LinkedList head) {
		
		if(head==null) {
			
			head=new LinkedList(data);
		}else {
			
			LinkedList ll=new LinkedList(data);
			ll.setNext(head);
			head=ll;
		}
		return head;
	}
	public void printLinkedList(LinkedList head) {
		LinkedList traversal=head;
		while(traversal.next!=null) {
			
			System.out.println(traversal.data);
			traversal=traversal.next;
		}
		
	}
	
	
		
		
		
		
		
	
	
	public static void main(String[] args) {
		
		LinkedList head=new LinkedList(1);
		
		head=head.addFront(5, head);
		head=head.addFront(6, head);
		head=head.addFront(7, head);
		head=head.addFront(9, head);
		head=head.addFront(2, head);
		
		rotateK k=new rotateK();
		head=k.rotateK(head);
		head.printLinkedList(head);
	
		
	}
}
