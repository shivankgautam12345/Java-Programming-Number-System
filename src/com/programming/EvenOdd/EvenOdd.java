package com.programming.EvenOdd;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc  = new Scanner(System.in);
      System.out.println("Enter Number which is to be checked:");
      int n = sc.nextInt();
      if(n%2==0) {
    	  System.out.println("Number is Even");
      }else {
    	  System.out.println("Number is odd");
      }
	}

}
