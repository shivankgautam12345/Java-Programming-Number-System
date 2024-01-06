package com.programming.automorphicno;
import java.util.Scanner;
import java.util.*;

public class AutoMorphicNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		if(isAutoMorphicNo(n)) {
			System.out.println("Number is AutoMorphic");
		}else {
			System.out.println("Number is Not AutoMorphic");
		}

	}
	public static boolean isAutoMorphicNo(int n) {
		int square =n*n;
		while(n!=0) {
			if(n%10!=square%10) {
				return false;
			}
			n = n/10;
			square = square/10;
		}
		return true;
	}


}


