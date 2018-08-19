package com.GeeksForGeeks.LinkedLists;

import java.util.Stack;

class IsPalindrome
{
    boolean isPalindrome(Node head) 
    {
        Stack<Integer> stack = new Stack<Integer>();
        Node trav=head;
        int count=1;
        while(trav!=null){
            stack.push(trav.data);
            trav=trav.next;
            
            count++;
        } 
        
        int cen=0;
        cen=(cen%2==0)?count:((count/2)+1);
      
        Node newTrav=head;
        int newCount=1;
        while(newCount!=cen){
            Integer y = (Integer) stack.pop();
            if(newTrav.data!=y){
                return false;
            }
            newTrav=newTrav.next;
            newCount++;
            
        }
        return true;
    }    
}