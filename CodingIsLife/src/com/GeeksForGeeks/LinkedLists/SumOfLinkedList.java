package com.GeeksForGeeks.LinkedLists;


import java.util.*;
class Node
    {
        int data;
        Node next;
        Node(){}
        Node(int d) {data = d; next = null; }
    }
class Add_LinkedList
{
    Node head;
	
	 void printList(Node head) 
	 {
        while (head != null) 
		{
            System.out.print(head.data + " ");
            head = head.next;
        }
        //System.out.println("");
    }
	
	
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);
 
        /* 3. Make next of new Node as head */
        new_node.next = head;
 
        /* 4. Move the head to point to new Node */
        head = new_node;
    }
   public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int T = sc.nextInt();
      while(T>0)
      {
        int n1 = sc.nextInt();
        Add_LinkedList list1 = new Add_LinkedList();
        for (int i = 1; i <= n1; i++) 
		{
            int a = sc.nextInt();
            list1.push(a);
        }
		int n2 = sc.nextInt();
		Add_LinkedList list2 = new Add_LinkedList();
		for(int i = 0; i < n2; i++)
		{
			int b = sc.nextInt();
			list2.push(b);
		}
		Add_LinkedList list3 = new Add_LinkedList();
        GfG g = new GfG();
        Node rs = g.addTwoLists(list1.head, list2.head);
		list3.printList(rs);
		System.out.println();
	   T--;}}}    
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*The Node is defined as
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
        Node(){}
    }
*/
class GfG
{
	Node addTwoLists(Node first, Node second)
	{
	   int carry=0; 
	   
	    int sum=0;
	   int data1=0;
	   int data2=0;
	   Node headFirst=first;
	   Node headSecond=second;
	   Node head=new Node();
	   
	 while((headSecond!=null) || (headFirst!=null)){
	     
	     if(headFirst!=null){
	      data1=headFirst.data;
	     headFirst=headFirst.next;
	         
	     }else {
	         
	         data1=0;
	     }
	     if(headSecond!=null){
	      data2=headSecond.data;
	     headSecond=headSecond.next;
	         
	     }else {
	         
	         data2=0;
	     }
	   sum= data1+data2+carry;
	   
	    if(sum>=10)
	    {
	        sum=sum%10;
	        carry=1;
	    }else {
	        
	        carry=0;
	    }

	   head=add(head,sum);
	   
	

	     
	 }
	 if(carry==1){
	       head=add(head,carry);
	 }
	  return head.next; 
	   
	}
	
	Node add(Node head,int data){
	   
	      Node traverse=head;
	    if(head==null){
	        
	        head=new Node(data);
	    }else {
	      
	   
	        while(traverse.next!=null){
	            traverse=traverse.next;
	        }
	        
	        traverse.next=new Node(data);
	        
	        }
	        return head;
	}
	
}