package com.programming.perfectornot;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc  = new Scanner(System.in);
     System.out.println("Enter the Number:");
     int n = sc.nextInt();
     int sum = 0;
     int temp = n;
     for(int i = 1;i<temp;i++) {
    	 if(temp%i==0) {
    		 sum = sum +i;
    	 }
     }
     if(n==sum) {
    	 System.out.println("Perfect number");
     }else {
    	 System.out.println("Not");
     }
   }

}
