package com.PracticeProblems;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String a = scanner.nextLine();

        String b = scanner.nextLine();
        int i=0;
       
        int sizeA=a.length();
        int sizeB=b.length();
         int countFinal=sizeA+sizeB;
  System.out.println("***"+countFinal);
            char charA[]=a.toCharArray();  
            Arrays.sort(charA);
            char charB[]=b.toCharArray();
            Arrays.sort(charB);
            
        if(sizeA>sizeB){
           while(i!=sizeA){
            	 int count=0;
            	 int newCount=0;
                for(int j=i;j<sizeA;j++){
                	System.out.println("Char A ->"+charA[i]+"Char B"+charA[j]);
                if(charA[i]==charA[j]){
                    count++;
                    
                   System.out.println("1111"+count); 
                    
                }
                    
               }
                
            for(int k=0; k<sizeB;k++){
                if(charA[i]==charB[k]){
                    newCount++;
                    
                }
                
            }
                i=i+count;
                
                if(count>newCount && newCount!=0){
                    countFinal=countFinal+newCount-count;
                }else if(count<newCount && newCount!=0) {
                    countFinal=countFinal+count-newCount;
                }else if(count==newCount){
                    countFinal=countFinal-newCount-count;
                }
            
            }
        }else{
            while(i!=sizeB){
            	 int count=0;
            	 int newCount=0;
                for(int j=i;j<sizeB;j++){
                if(charB[i]==charB[j]){
                    count++;
                    
                    System.out.println("count"+count+charB[i]); 
                    
                }
                    
               }
                
            for(int k=0; k<sizeA;k++){
                if(charB[i]==charA[k]){
                    newCount++;
                    System.out.println("newCount"+charB[i]+newCount);
                }
                
            }
                i=i+count;
                
                if(count>newCount && newCount!=0){
                    countFinal=countFinal+newCount-count;
                    System.out.println("count Final"+ countFinal);
                }else if(count<newCount && newCount!=0) {
                    countFinal=countFinal+count-newCount;
                    System.out.println("Count Final"+countFinal);
                }else if(count==newCount){
                    countFinal=countFinal-newCount-count;
                    System.out.println("Count Final EQUAL"+countFinal+"+"+count+"+"+newCount);
                }
            
            }
            
        }
            
        
        
        System.out.println(countFinal);
        
        scanner.close();
    }
}
