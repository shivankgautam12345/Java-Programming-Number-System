package com.programming.rangesum;
import java.util.Scanner;
public class RangeSumNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc  = new Scanner(System.in);
      System.out.println("Enter the lower range:");
      int n1 = sc.nextInt();
      System.out.println("Enter the upper range:");
      int n2 = sc.nextInt();
      int sum = 0;
      for(int i = n1;i<=n2;i++) {
    	  sum = sum+i;
      }System.out.println(sum);
	}

}
