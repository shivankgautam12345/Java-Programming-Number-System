package com.programming.factorornot;
import java.util.Scanner;
public class FactorOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number whose factor is to be checked:");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++) {
        	if(n%i==0) {
        		System.out.println("The factor of the given number is:"+i);
        	}
        }
	}

}
