package com.lyna.beginner;

import java.util.Scanner;

public class PractiseFor3_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
	    if (number % 2 == 0) {
	    	System.out.println(number + " is even.");
	    	System.out.println(number + " is odd.");
	    } else
	    	System.out.println(number + " is odd.");
	}
}
