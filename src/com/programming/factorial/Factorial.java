package com.programming.factorial;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number whose factorial is to found:");
       int n = sc.nextInt();int fact =1;
       
       for(int i = n;i>=1;i--) {
    	   fact = fact*i;
       }System.out.println(fact);
	}

}
