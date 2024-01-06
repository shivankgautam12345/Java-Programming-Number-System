package com.programming.strongnumber;
import java.util.Scanner;
public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc  = new Scanner(System.in);
       System.out.println("Enter the Lower Range:");
       int l1 = sc.nextInt();
       System.out.println("Enter the upper Range:");
       int u1 = sc.nextInt();
       for(int i = l1;i<=u1;i++) {
    	   if(isStrong(i)) {
    		   System.out.println(i);
    	   }
       }
       
	}
	public static boolean isStrong(int n) {
		  int sum = 0;
		  int temp = n;
		 while(temp>0) {
			 int digit = temp%10;
			 int fact = 1;
			 for(int i=digit;i>=1;i--) {
				 fact = fact*i;
			 }
			 sum  = sum+fact;
			 
			 temp = temp/10;
		 }if(sum==n) {
			 return true;
		 }else {
			 return false;
		 }
		
	}

}
