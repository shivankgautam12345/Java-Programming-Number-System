package com.programming.amicableorfriendly;
import java.util.Scanner;
public class FriendlyPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc  = new Scanner(System.in);
       System.out.println("Enter the number one");
       int n1 = sc.nextInt();
       System.out.println("Enter the number two");
       int n2 = sc.nextInt();
       int sum1 = 0;
       int sum2 = 0;
       for(int i = 1;i<=n1;i++) {
    	   if(n1%i==0) {
    		   sum1 = sum1+i;
    		   }
       }
       for(int i = 1;i<=n2;i++) {
    	   if(n2%i==0) {
    		   sum2 = sum2+i;
    		   }
       }
       if(sum1/n1 == sum2/n2) {
    	   System.out.println("Amicable Number");
       }else {
    	   System.out.println("not Amicable Number");
       }
    		   
	}

}
