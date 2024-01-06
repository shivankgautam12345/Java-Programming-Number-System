package com.programming.primeno;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Number which has to be checked whether it is prime or not:");
     int n = sc.nextInt();
     int count = 0;
     if(n<2) {
    	 count = 0;
     }
     for(int i = 2;i<=n-1;i++) {
    	 if(n%i==0) {
    		 count++;
    	 }
     }
     if(count>0) {
    	 System.out.println("Number is not Prime");
     }else {
    	 System.out.println("Number is prime");
     }
	}

}
