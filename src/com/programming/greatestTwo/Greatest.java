package com.programming.greatestTwo;
import java.util.Scanner;
public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc  = new Scanner(System.in);
      System.out.println("Enter First Number:");
      int n1 = sc.nextInt();
      System.out.println("Enter Second Number:");
      int n2 = sc.nextInt();
      if(n1>n2) {
    	  System.out.println("n1 is greater");
      }else {
    	  System.out.println("n2 is greater");
      }
      
      }

}
