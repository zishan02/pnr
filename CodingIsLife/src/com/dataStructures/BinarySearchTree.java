package com.dataStructures;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {

	int data;
	BinarySearchTree left;
	BinarySearchTree right;
	

	
	public BinarySearchTree insert(BinarySearchTree root,int data) {
		
		if(root==null) {
			BinarySearchTree bst=new BinarySearchTree();
			bst.left=bst.right=null;
			bst.data=data;
			root=bst;
			
		}else if(data>root.data) {
		
			
			root.right=insert(root.right,data);
		}else if(data<root.data){
			
			
			root.left=insert(root.left,data);
		}
		return root;
	}
	
	public boolean SearchBST(BinarySearchTree root,int data) {
		
		if(root==null) return false;
		if(root.data==data) return true;
		else if(data>root.data) {
			root=root.right;
			SearchBST(root,data);
		}else if(data<root.data) {
			root=root.left;
			SearchBST(root,data);
		}
		return false;
	}
	
	public void TraversePreOrder(BinarySearchTree root) {
		
		if(root==null)
			return;
	    System.out.println(root.data);
	  
	    TraversePreOrder(root.left);
	   
	    TraversePreOrder(root.right);
		
	}
	public void TraverseINOrder(BinarySearchTree root) {
		
		if(root==null) return;
		
		TraverseINOrder(root.left);
		System.out.println(root.data);
		TraverseINOrder(root.right);
		
	}
	
	public void TraversePostOrder(BinarySearchTree root) {
if(root==null) return;
		
		TraverseINOrder(root.left);
		
		TraverseINOrder(root.right);
		System.out.println(root.data);
	}
	
	public void findMin(BinarySearchTree root) {
		
		while(root.left!=null) {
			
			root=root.left;
		}
		System.out.println("Minimum" +root.data);
	}
	public void findMax(BinarySearchTree root) {
		
		while(root.right!=null) {
			
			root=root.right;
		}
		System.out.println("Maximum"+root.data);
	}
	public int findHeight(BinarySearchTree root) {
		
		if(root==null)
			return -1;
		
	int heightLeft=	findHeight(root.left);
	int heightRight= findHeight(root.right);
		return Math.max(heightLeft, heightRight)+1;
	}
	public void levelOrderTraversal(BinarySearchTree root) {
		Queue<BinarySearchTree> Q=new LinkedList<>();
		if (root ==null) return;
		
		
		
		Q.add(root);
		while(!Q.isEmpty()) {
			
			BinarySearchTree bst=Q.peek();
			System.out.println(bst.data);
			if(bst.left!=null) Q.add(bst.left);
			if(bst.right!=null) Q.add(bst.right);
			Q.remove();
			
		}
	}
	
	public boolean isBst(BinarySearchTree root) {
		
		
		if(root==null)
			return true;
		boolean checkLeftFlag=true;
		boolean checkRightFlag=true;
		System.out.println(checkLeft(root,checkLeftFlag) );
		System.out.println(checkRight(root,checkRightFlag));
		if(checkLeft(root,checkLeftFlag) && checkRight(root,checkRightFlag) && unqiue(root)) {
			
			return true;
		}
	
		return false;
	}
	public boolean checkLeft(BinarySearchTree bst,boolean check) {
		
		if(bst.left==null)
			return true;
		
		if(bst.data>bst.left.data)
		{
			check=checkLeft(bst.left,check);
		}else {
			return false;
		}
		return check;
	}
	
public boolean checkRight(BinarySearchTree bst,boolean check) {
		
		if(bst.right==null)
			return true;
		
		if(bst.data<bst.right.data)
		{
			check=checkLeft(bst.right,check);
		}else {
			return false;
		}
		return check;
	}
/*public void checkUnique(BinarySearchTree root) {
	
	BinarySearchTree bst=root;
	if(root==null)
		return;
	
	boolean find=checkHere(root.left,root,true);
	if(find==false) {
		
	}else {
		checkUnique(root.left);
	}
	
	
}
public boolean checkHere(BinarySearchTree leftbranch, BinarySearchTree rightBranch,boolean check) {
	
	if(rightBranch==null)
		return true;
	if(leftbranch.data!=rightBranch.data && check!=false ) {
		check=checkHere(leftbranch,rightBranch.left,check);
		check=checkHere(leftbranch,rightBranch.right,check);
		
	}else {
		check=false;
	}
	
	return check;
}*/
public boolean unqiue(BinarySearchTree root) {
	Stack<Integer> data=new Stack<>();
	 data=checkUnqiue(root, data);
	int size=data.size();
	System.out.println("size"+size);
	int a[]=new int[size];
	int count=0;

	
	while(!data.isEmpty()) {
		
		a[count]=data.peek();
		
		count++;
		data.pop();
	}
	for (int i=0;i<size;i++) {
		
		for(int j=i+1;j<size;j++)
		{
			if (a[i]==a[j])
			{
				System.out.println("***"+a[i]);
				return false;
			}  
			
		}
			
		
	}
	return true;
}

public Stack<Integer> checkUnqiue(BinarySearchTree bst, Stack<Integer> data) {
	
	if(bst==null)
		return data; 
	data.push(bst.data);
	checkUnqiue(bst.left, data);
	checkUnqiue(bst.right, data);
	
	return data;
}
	
	public static void main(String[] args) {
		
		BinarySearchTree bst=new BinarySearchTree();
		BinarySearchTree root=null;
		root=bst.insert(root,1);
		
		root=bst.insert(root,2);
		
		root=bst.insert(root,4);
		
		root=bst.insert(root,3);
		root=bst.insert(root,5);
		root=bst.insert(root,6);
		root=bst.insert(root,7);
		//System.out.println(root.data);
		//bst.TraversePreOrder(root);
		//bst.TraversePostOrder(root);
		bst.findMin(root);
		bst.findMax(root);
		//int height=bst.findHeight(root);
		//System.out.println(height);
		//bst.levelOrderTraversal(root);
		//System.out.println(bst.isBst(root));
		System.out.println(bst.unqiue(root));
		//bst.TraverseINOrder(root);
		//boolean result=bst.SearchBST(5);
		//System.out.println(result);
		
		
	}
	
}


