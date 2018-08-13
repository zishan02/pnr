package com.javaCoreConcepts.Practice;

import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        s.nextLine();
        while(t-->0){
            String name=s.nextLine();
            int n=name.length();
            int r=0,k=0,rmax=0,kmax=0,minmax=0;
            int rnum=0,knum=0;
            for(int i=0;i<n;i++){
                if(name.charAt(i)=='S') knum++;
                else rnum++;
            }
            if(knum!=0){
            for(int i=0;i<n;i++){
                if(name.charAt(i)=='S') k++;
                else r++;
                if(minmax<k-r){
                    minmax=k-r;
                    kmax=k;
                    rmax=r;
                }
                if(k<=r){
                    k=0;
                    r=0;
                }
            }
            System.out.println(rnum-rmax+kmax);
            }else System.out.println(rnum-1);
        }
        
 
        
 
        // Write your code here
 
    }
}