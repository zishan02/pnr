package com.dataStructures.LinkedList;

public class LLImpl {

	int data;
	LLImpl next;
	LLImpl head;
	LLImpl(){}
	
	LLImpl(int data){
		
		this.data=data;
	}
public void rotateLL(int k) {
	
	int count=1;
	LLImpl point=head;
	LLImpl endPointer=head;
	while(count!=k) {
		
		point=point.next;
		count ++;
	}
	while(endPointer.next!=null) {
		
		endPointer=endPointer.next;
	}
	
	endPointer.next=head;
	head=point.next;
	point.next=null;
	
}	
	
	public void insertLLHead(int data) {
		
		
		if(head==null) {
			
			head=new LLImpl(data);
		}else {
		
		LLImpl impl=new LLImpl(data);
		
		impl.next=head;
		head=impl;
		
		}
		
	}
	
	public void insertLLTail(int data) {
		LLImpl tailTrav=head;
		
		if(head==null) {
			head=new LLImpl(data);
		}else {
			
			while(tailTrav.next!=null)
			{
				tailTrav=tailTrav.next;
				
			}
			
			LLImpl tailIns=new LLImpl(data);
			tailTrav.next=tailIns;
			
			
		}
		
	}
	
	public void printLL() {
		
		
		
		LLImpl printNode=head;
		if(printNode==null) {
			
			System.out.println("Empty Linked List");
		}
		
		while(printNode != null) {
			
			System.out.println(printNode.data);
			printNode=printNode.next;
		}
	}
	
	
public void rotateKNodes(int k) {

	
	LLImpl current=head;
	LLImpl last=head;
	int count =1;
	int nodeCount=0;
	
	while(last!=null) {
		
		last=last.next;
		count++;
		nodeCount++;
		
		if(count==k || last==null) {
			LLImpl next=null;
			LLImpl prev=last.next;
			LLImpl check=last.next;
		
		
			while(current!=check) {
				System.out.println(current.data);
				next=current.next;
				current.next=prev;
				prev=current;
				current=next;
				
				
			}
			if(nodeCount==1)
			{
				head=current;
			}
			
			last=check;
			k=1;
		}
	
	}
	
	
}	
	
public static void main(String[] args) {
	
	
	LLImpl ll=new LLImpl();
/*	ll.insertLLHead(5);
	ll.insertLLHead(6);
	ll.insertLLHead(7);
	ll.insertLLHead(8);
	ll.insertLLHead(9);*/
	
	ll.insertLLTail(1);
	ll.insertLLTail(2);
	ll.insertLLTail(3);
	ll.insertLLTail(4);
	ll.insertLLTail(5);
	ll.insertLLTail(6);
	ll.insertLLTail(7);
	ll.insertLLTail(8);
	//ll.rotateLL(2);
	ll.rotateKNodes(3);
	ll.printLL();
	
}	
	
	
}
