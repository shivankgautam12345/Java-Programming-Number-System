package com.programming.reversenumber;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc  = new Scanner(System.in);
      System.out.println("Enter the number which is too be reversed:");
      int n = sc.nextInt();
      int rev = 0;
      while(n>0) {
    	  int digit = n%10;
    	  rev = rev*10 + digit;
    	  n = n/10;
      }
      System.out.println(rev);
	}

}
