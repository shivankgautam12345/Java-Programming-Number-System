package com.programming.palindrome;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc  = new Scanner(System.in);
          System.out.println("Enter the Number Which is to be checked Whether it is palindrome or not:");
          int n = sc.nextInt();
          int rev = 0;
          int temp = n;
          while(temp>0) {
        	   rev = rev*10 + temp%10;
        	  temp = temp/10;
        	  
        	  
          }
        		if(n==rev) {
        			System.out.println("Number is palindromic");
        		}else {
        			System.out.println("Number is not Palindromic");
        		}
	
	}

}
