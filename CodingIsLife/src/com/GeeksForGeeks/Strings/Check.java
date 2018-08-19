package com.GeeksForGeeks.Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Check {
	
	public static void main(String[] args) {
		
	
	   try{
			BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
			int T=Integer.parseInt(input.readLine());
			Stack<Character> stack=new Stack<Character>();
			for(int i=0;i<T;i++){
			    
			    String s=input.readLine();
			    char []a=s.toCharArray();
			    int len=a.length;
			    for(int j=0;j<len;j++){
			        
			        if(a[j]=='{')
			        {
			            stack.push('{');
			        }else if(a[j]=='['){
			            
			            stack.push('[');
			        }else if(a[j]=='('){
			            
			            stack.push('(');
			        }else if(a[j]=='}')
			            {
if(stack.empty()) {
	stack.push('}');	
			        		
			        	}
			           char check=(char) stack.peek();
			           if(check=='{'){
			               
			               stack.pop();
			           }
			           
			           
			        }else if(a[j]==')')
			            {
			        	if(stack.empty()) {
			        		
			        		stack.push(')');	
			        	}
			           char check=(char) stack.peek();
			           
			           if(check=='('){
			               
			               stack.pop();
			           }
			           
			           
			        }else if(a[j]==']')
			            {
                  if(stack.empty()) {
			        		
                	  stack.push(']');	
			        	}
			           char check=(char) stack.peek();
			           if(check=='['){
			               
			               stack.pop();
			           }
			           
			           
			        }
			            
			            
			        }
			        
			        if(stack.empty()){
			            
			            System.out.println("balanced");
			        }else {
			             System.out.println("not balanced");
			            
			        }
			        
			    }
			    
			    
			}catch(Exception e){
			   e.getMessage(); 
			}
}
}
