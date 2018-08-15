package com.dataStructures.LinkedList;

public class LLImpl {

	int data;
	LLImpl next;
	LLImpl head;
	LLImpl head2;
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
	public void insertLLHead2(int data) {
		
		
		if(head2==null) {
			
			head2=new LLImpl(data);
		}else {
		
		LLImpl impl=new LLImpl(data);
		
		impl.next=head2;
		head2=impl;
		
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
	
	
public void printLL2() {
		
		
		
		LLImpl printNode=head2;
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
LLImpl MergeLists() {
	LLImpl s=null;
	LLImpl k=null;
	
	int count=0;
    LLImpl p=head;
    LLImpl q=head2;
    while(p!=null || q!=null){
      
        if(p.data<=q.data){
        	
        	if(count==0) {
                s=p;
                k=p;
             	}else {
             		
             		s.next=p;
             		s=s.next;
             	}
          
            p=p.next;
            
         
            
           
      
            
        }else if(q.data<p.data) {
          
        	if(count==0) {
           s=q;
           k=q;
        	}else {
        		
        		s.next=q;
        		s=s.next;
        	}
          
           q=q.next;
          
          
          
          
        }
        count++;
        if(p==null) {
        
        	s.next=q;
        	//System.out.println(s.data);
        	break;
        }else if(q==null) {
        	
        	s.next=p;
        	//System.out.println(s.data);
        	break;
        }
        
      
 
        
    }
 return k;
    
   } 

	
public static void main(String[] args) {
	
	
	LLImpl ll=new LLImpl();
/*	ll.insertLLHead(5);
	ll.insertLLHead(6);
	ll.insertLLHead(7);
	ll.insertLLHead(8);
	ll.insertLLHead(9);*/
	
	ll.insertLLTail(1);

	ll.insertLLTail(1);
	
	//ll.insertLLHead2(5);
	ll.insertLLHead2(4);
	ll.insertLLHead2(2);
	
LLImpl ll1=	ll.MergeLists();
System.out.println(ll1.data+"->"+ll1.next.data+"->"+ll1.next.next.data);
	//ll.rotateLL(2);
	//ll.rotateKNodes(3);
	//ll.printLL();
	
}	
	
	
}
