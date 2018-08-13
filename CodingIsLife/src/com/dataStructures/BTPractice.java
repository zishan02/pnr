package com.dataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class BTPractice {

	BTPractice left;
	BTPractice right;
	int data;
	
	BTPractice (int data){
		
		this.data=data;
	}
	
	BTPractice(){}
	
	
	
	public BTPractice InsertBT(BTPractice root,int data) {
		
		if(root==null) {
			
			root=new BTPractice(data);
		}else {
			
			if(data>root.data)
			{
				root.right=InsertBT(root.right,data);
			}else {
				
				root.left=InsertBT(root.left,data);
			}
		}
		return root;
	}
	public void printLevelOrderTraversal(BTPractice root) {
		Queue<BTPractice> qu=new LinkedList<>();
		
		if(root==null) return;
		qu.add(root);
		while(!qu.isEmpty()) {
			
			BTPractice bs=qu.peek();
			System.out.println(bs.data);
			if(bs.left!=null) {
				qu.add(bs.left);
			}
			if(bs.right!=null) {
				qu.add(bs.right);
			}
		qu.remove();	
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		BTPractice bst=new BTPractice();
	
		BTPractice root=null;
		root=bst.InsertBT(root,1);
		
		root=bst.InsertBT(root,2);
		root=bst.InsertBT(root,3);
		
		root=bst.InsertBT(root,4);
		
		
		root=bst.InsertBT(root,5);
		
		bst.printLevelOrderTraversal(root);
	}
	
}
