package com.lyna.beginner;

import java.util.Scanner;

public class OtherIfExpress {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = input.nextInt();
	    int y = (x > 0) ? 1 : -1;
	    System.out.println(y);
		//if (x > 0) {
		//System.out.println("y = 1");
		//}  else System.out.println("y = -1");
	    
	    System.out.println((x % 2 == 0) ? "x is even" : "x is odd");
	    System.out.println((y == 1) ? "x > 0" : "x <= 0");
	}
}
