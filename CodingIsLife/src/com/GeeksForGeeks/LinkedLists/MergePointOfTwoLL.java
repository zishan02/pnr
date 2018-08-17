package com.GeeksForGeeks.LinkedLists;

import java.util.Scanner;

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

class LinkedList_Intersection
{
Node head;  
Node tail;
public void addToTheLast(Node node) 
{
if (head == null) {
head = node;
tail = head;
} else {
//Node temp = head;
//while (temp.next != null)
//temp = temp.next;
//temp.next = node;
tail.next=node;
tail = node;
}
}
/* Function to print linked list */
void printList()
{
    Node temp = head;
    while (temp != null)
    {
       System.out.print(temp.data+" ");
       temp = temp.next;
    }  
    System.out.println();
}

 

 /* Driver program to test above functions */
public static void main(String args[])
{
   
     
    /* Constructed Linked List is 1->2->3->4->5->6->
       7->8->8->9->null */
     Scanner sc = new Scanner(System.in);
	 int t=sc.nextInt();
	 
	 while(t>0)
     {
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		LinkedList_Intersection llist1 = new LinkedList_Intersection();
	    LinkedList_Intersection llist2 = new LinkedList_Intersection();
		LinkedList_Intersection llist3 = new LinkedList_Intersection();
		
			int a1=sc.nextInt();
			Node head1= new Node(a1);
			Node tail1= head1;
			llist1.addToTheLast(head1);
			for (int i = 1; i < n1; i++) 
			{
				int a = sc.nextInt(); 
				llist1.addToTheLast(new Node(a));
			}
		
		
			int b1=sc.nextInt();
			Node head2 = new Node(b1);
			Node tail2 = head2;
			llist2.addToTheLast(head2);
			for (int i = 1; i < n2; i++) 
			{
				int b = sc.nextInt(); 
				llist2.addToTheLast(new Node(b));
			}
			
			int c1=sc.nextInt();
			Node head3= new Node(c1);
			Node tail3=head3;
			llist3.addToTheLast(head3);
			for (int i = 1; i < n3; i++) 
			{
				int c = sc.nextInt(); 
				llist3.addToTheLast(new Node(c));
			}
			
			if (tail1 != null)
			tail1.next = head3;
			if (tail2 != null)
			tail2.next = head3;
			
			//llist1.head= new GFG().Intersection(llist1.head,llist2.head);
			//llist1.printList();		
			//System.out.println();
			
			MergePointOfTwoLL obj = new MergePointOfTwoLL();
			System.out.println(obj.intersectPoint(llist1.head, llist2.head));
		t--;			
     }
      
	
    
	
}
}


public class MergePointOfTwoLL {

		int intersectPoint(Node headA, Node headB)
		{int a=0;
		    Node first=headA;
		    Node second=headB;
		    Node traverseA=headA;
		    Node traverseB=headB;
		    int count1=1;
		    int count2=1;
		    while(first!=null){
		        count1++;
		        first=first.next;
		    }
		    
		    while(second!=null){
		        count2++;
		        second=second.next;
		        
		    }
		if(count1>count2){
		   a= this.count(traverseA,traverseB,count1,count2);
		}else {
		   a= count(traverseB, traverseA,count2,count1);
		}
		  
		  return a;  
		}
		
		int count(Node A, Node B, int count1, int count2){
		    int countNew=0;
		    int data=-1;
		    int count=count1-count2+1;
		    
		    while(A !=null || B!=null){
		        countNew++;
		        if(A==B){
		            data=A.data;
		            break;
		        }
		        
		        A=A.next;
		        if(countNew>=count){
		        B=B.next;
		        }
		        
		    }
		    return data;
		    
		}
	}

