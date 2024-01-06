package com.learning.harshadno;
import java.util.Scanner;
public class HarshadNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc  = new Scanner(System.in);
     System.out.println("Enter the Number:");
     int n = sc.nextInt();
     int sum = 0;
     int temp = n;
		while(temp>0) {
			int digit = temp%10;
			sum = sum+digit;
			temp = temp/10;
		}
		if(n%sum==0) {
			System.out.println("HarshadNo.");
		}else {
			System.out.println("not");
		}
		
		
		
	}

}
