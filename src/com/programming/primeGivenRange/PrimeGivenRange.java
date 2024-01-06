package com.programming.primeGivenRange;
import java.util.Scanner;

public class PrimeGivenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the lower range:");
		int l1 = sc.nextInt();
		System.out.println("Enter the Upper Range:");
		int u1 = sc.nextInt();
		for(int i = l1;i<=u1;i++) {
		      if(isPrime(i)) {
		      System.out.println(i);
		      }
		}
	}
	public static boolean isPrime(int n) {
		if(n<2) {
			return false;
		}
		for(int i =2;i<=n-1;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
