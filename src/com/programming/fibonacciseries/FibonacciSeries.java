package com.programming.fibonacciseries;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc  = new Scanner(System.in);
       System.out.println("Enter the number upto which the fibonacci series has to be found:");
       int term = sc.nextInt();
       int a = 0;
       int b = 1;
       if(term == 1) {
    	   System.out.println(a+" ");
       }
       if(term == 2) {
    	   System.out.println(a+" "+b);
       }
       else {
    	   System.out.println(a+" "+b+" ");
       for(int i = 3;i<=term;i++) {
    	   int c = a+b;
    	   System.out.println(c+" ");
    	   a = b;
    	   b = c;
    	   
       }
       
	}
	}
}
