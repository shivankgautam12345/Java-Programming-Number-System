package com.programming.greatestthree;
import java.util.Scanner;
public class GreatestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc  = new Scanner(System.in);
     System.out.println("Enter First Number:");
     int n1 = sc.nextInt();
     System.out.println("Enter Second Number:");
     int n2 = sc.nextInt();
     System.out.println("Enter Third Number:");
     int n3 = sc.nextInt();
     if(n1>n2 && n1>n3) {
    	 System.out.println("n1 is Greater");
     }else if(n2>n3) {
    	 System.out.println("n2 is Greater");
     }else {
    	 System.out.println("n3 is greater");
     }
	}

}
