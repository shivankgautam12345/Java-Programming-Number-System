package com.programming.coordinatecheck;
import java.util.Scanner;
public class CoordinateCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc  = new Scanner(System.in);
       System.out.println("Enter the Value of x:");
       int x = sc.nextInt();
       System.out.println("Enter the value of y:");
       int y = sc.nextInt();
       if(x>0 && y>0) {
    	   System.out.println("First Quadrant");
       }else if(x<0 && y>0) {
    	   System.out.println("Second Quadrant");
       }else if(x<0 && y<0) {
    	   System.out.println("Third Quadrant");
       }else {
    	   System.out.println("Fourth Quadrant");
       }
	}

}
