package com.learning.armstrong;
import java.util.Scanner;
public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		int res = isArmStrong(n);
		//System.out.println(res);
		if(res == n) {
			System.out.println("Number is Armstrong");
		}else {
			System.out.println("Not Armstrong");
		}
	}
	
	public static int length(int n){
		int count = 0;
		while(n>0) 
		{
			int digit  = n%10;
			count++;
			n = n/10;
		}return count;
	}
	public static int isArmStrong(int n) {
		int Length = length(n);
		int sum  = 0;
		int temp = n;

		while(temp>0) {
			int digit  = temp%10;
			int product = 1;
			for(int i = 1;i<=Length;i++) {

				product = product*digit;

			}sum = sum+product;
       temp = temp/10;
		}return sum;
	}

}
