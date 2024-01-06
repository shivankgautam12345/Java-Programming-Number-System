package com.programming.sumfivenatural;
import java.util.Scanner;
public class SumFirstFiveNatural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc  = new Scanner(System.in);
       System.out.println("Enter the number upto which the sum has to be found:");
       int n = sc.nextInt();
       int sum = 0;
       for(int i = 1;i<=n;i++) {
    	   sum = sum +i;
       }System.out.println(sum);
	}     

}
