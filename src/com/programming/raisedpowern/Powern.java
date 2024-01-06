package com.programming.raisedpowern;
import java.util.Scanner;
public class Powern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        System.out.println("Enter the Power:");
        int power = sc.nextInt();
        int product = 1;
        int res = 1;
        for(int i = 1;i<=power;i++) {
        	product = product*n;
        }
        
        System.out.println(product);
	}

}
