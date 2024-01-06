package com.programming.rangearmstrong;
import java.util.Scanner;
public class RangeArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc   = new Scanner(System.in);
       System.out.println("Enter the Lower Range:");
       int l1 = sc.nextInt();
       System.out.println("Enter the Upper Range:");
       int u1 = sc.nextInt();
       int count  = 0;
       for(int i = l1;i<=u1;i++) {
    	   if(isArmStrong(i)) {
    		   count++;
    		  System.out.println(i); 
    	   }
       }System.out.println("Total No. of Armstrong present in the given Range "+count);
       
	}
	public static int length(int n) {
		int count = 0;
		while(n>0) {
			int digit = n%10;
			count++;
			n = n/10;
		}return count;
	}
	public static boolean isArmStrong(int n) {
		int Length = length(n);
		int sum = 0;
		
		int temp = n;
		while(temp>0) {
			int product = 1;
			int digit = temp%10;
			for(int i = 1;i<=Length;i++) {
				product = product*digit;
			}
			sum = sum+product;
			temp = temp/10;
		}
		if(sum==n) {
			return true;
		}else {
			return false;
		}
	}
}
